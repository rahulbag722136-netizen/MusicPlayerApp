public class Song {

    private String title;
    private String artist;
    private String album;
    private int duration;

    // Constructor
    public Song(String title, String artist, String album, int duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    // Getter Methods
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public int getDuration() {
        return duration;
    }

    // Setter Methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Display Song Information
    public void displaySongInfo() {
        System.out.println("Song Title : " + title);
        System.out.println("Artist     : " + artist);
        System.out.println("Album      : " + album);
        System.out.println("Duration   : " + duration + " seconds");
    }

    // toString Method
    @Override
    public String toString() {
        return title + " - " + artist + " (" + duration + " sec)";
    }
}