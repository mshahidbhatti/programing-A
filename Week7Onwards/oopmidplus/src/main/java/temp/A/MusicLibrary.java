package temp.A;

public class MusicLibrary {
    private String name;
    private Librarian librarian;
    private Playlist[] playlists = new Playlist[2];
    private RegisteredListener[] listeners = new RegisteredListener[2];
    private int playlistCount = 0;
    private int listenerCount = 0;

    public MusicLibrary(String name, Librarian librarian) {
        this.name = name;
        this.librarian = librarian;
    }

    public void addPlaylist(Playlist p) {
        if (playlistCount < playlists.length) {
            playlists[playlistCount++] = p;
        }
    }

    public void addListener(RegisteredListener l) {
        if (listenerCount < listeners.length) {
            listeners[listenerCount++] = l;
        }
    }

    public String toString() {
        String result = "Music Library: " + name + "\n";
        result += "Librarian: " + librarian.toString() + "\n\n--- Playlists ---\n";
        for (int i = 0; i < playlistCount; i++) {
            result += playlists[i].toString() + "\n";
        }
        result += "--- Registered Listeners ---\n";
        for (int i = 0; i < listenerCount; i++) {
            result += listeners[i].toString() + "\n";
        }
        return result;
    }
}