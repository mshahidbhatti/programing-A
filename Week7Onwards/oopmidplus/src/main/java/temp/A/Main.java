package temp.A;

public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Sana Ahmed", 4);
        MusicLibrary library = new MusicLibrary("TuneVault", librarian);
        Artist a1 = new Artist("Ayaan Malik", "Pop");
        Artist a2 = new Artist("Zara Khan", "Indie");
        Artist a3 = new Artist("Sami Shah", "Jazz");
        Track t1 = new Track("Dreaming", "T001", a1);
        Track t2 = new Track("Sunlight", "T002", a2);
        Track t3 = new Track("Waves", "T003", a3);

        Playlist p1 = new Playlist("Morning Chill", "Pop");
        p1.addTrack(t1);
        p1.addTrack(t2);

        Playlist p2 = new Playlist("Night Jazz", "Jazz");
        p2.addTrack(t3);

        library.addPlaylist(p1);
        library.addPlaylist(p2);

        RegisteredListener l1 = new RegisteredListener("Hassan Ali", 101);
        RegisteredListener l2 = new RegisteredListener("Maria Rafiq", 102);

        library.addListener(l1);
        library.addListener(l2);

        System.out.println(library);

        System.out.println("\n--- Track Comparison ---");
        System.out.println("Are T001 and T002 equal? " + t1.equals(t2));

        System.out.println("\n--- Listener Comparison ---");
        System.out.println("Are 101 and 102 equal? " + l1.equals(l2));
    }
}
