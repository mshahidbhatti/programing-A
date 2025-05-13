package temp.A;

public class Playlist {
    private String title;
    private String genre;
    private Track[] tracks = new Track[5];
    private int trackCount = 0;

    public Playlist(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public void addTrack(Track t) {
        if (trackCount < tracks.length) {
            tracks[trackCount++] = t;
        }
    }

    public String toString() {
        String result = "Playlist: " + title + " (" + genre + ")\n";
        for (int i = 0; i < trackCount; i++) {
            result += "  - " + tracks[i].toString() + "\n";
        }
        return result;
    }
}
