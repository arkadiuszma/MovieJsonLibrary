import java.util.List;

public record Movie(String title, int yearOfPublication, Director director, String genre, List<Actor> actors) {
    @Override
    public String toString() {
        return "Title: " + title + '\n' +
                "Publication year: " + yearOfPublication + '\n' +
                "Director: " + director + '\n' +
                "Genre: " + genre + '\n' +
                "Actors: " + actors;
    }
}

