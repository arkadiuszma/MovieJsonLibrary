import java.util.List;
import java.util.Random;

public record MovieLibrary(List<Movie> movies) {

    void searchMoviesBetweenDates() {
        System.out.println("Enter year from: ");
        int yearFrom = UserInputHandler.getNumber();
        System.out.println("Enter year to: ");
        int yearTo = UserInputHandler.getNumber();
        printList(movies.stream().filter(y -> y.yearOfPublication() >= yearFrom && y.yearOfPublication() <= yearTo).toList());
    }

    void getRandomMovie() {
        int randomIndex = new Random().nextInt(movies().size());
        System.out.println(movies().get(randomIndex));
    }

    void searchByActor() {
        System.out.println("Enter actor name: ");
        String enteredName = UserInputHandler.getText();
        System.out.println("Enter actor second name: ");
        String enteredLastName = UserInputHandler.getText();
        printList(movies().stream().filter(a -> a.actors().stream()
                .anyMatch(n -> n.name().matches(enteredName) && n.lastName().matches(enteredLastName))).toList());
    }

    private void printList(List<Movie> filteredMovies) {
        if (filteredMovies.size() == 0) {
            System.out.println("No matches found");
        } else {
            filteredMovies.stream().map(Movie::title)
                    .forEach(System.out::println);
        }
    }
}
