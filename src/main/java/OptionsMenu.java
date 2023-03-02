
public class OptionsMenu {

    protected static void chooseOption(MovieLibrary movieLibrary) {
        while (true) {
            printInformation();
            switch (UserInputHandler.getNumber()) {
                case 1 -> movieLibrary.searchMoviesBetweenDates();
                case 2 -> movieLibrary.getRandomMovie();
                case 3 -> movieLibrary.searchByActor();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid input. Please enter correct number.");
            }
        }
    }

    private static void printInformation() {
        System.out.println("""
                Enter correct number from below:
                                1 – Search movies between 2 dates
                                2 – Display all information about random movie
                                3 – Display all movies where selected actor played
                                4 - Exit program
                """);
    }


}
