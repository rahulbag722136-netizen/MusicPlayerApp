import java.util.*;

public class Playlist {

    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(int index) {
        if (index >= 0 && index < songs.size())
            songs.remove(index);
    }

    public void shuffle() {
        Collections.shuffle(songs);
    }

    public void displaySongs() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i));
        }
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }
}