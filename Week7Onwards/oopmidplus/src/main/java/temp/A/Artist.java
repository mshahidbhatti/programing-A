package temp.A;

public class Artist extends Person {
    private String genre;

    public Artist(String name, String genre) {
        super(name);
        this.genre = genre;
    }

    public String toString() {
        return super.toString() + ", Genre: " + genre;
    }
}
