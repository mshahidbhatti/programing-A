package temp.A;

public class Track {
    private String title;
    private String trackId;
    private Artist artist;

    public Track(String title, String trackId, Artist artist) {
        this.title = title;
        this.trackId = trackId;
        this.artist = artist;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Track) {
            Track other = (Track) obj;
            return this.trackId.equals(other.trackId);
        }
        return false;
    }

    public String toString() {
        return "\"" + title + "\" (ID: " + trackId + ") - " + artist.toString();
    }
}
