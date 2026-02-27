import java.util.*;

public class MusicLibrary {

    private List<Song> library;

    public MusicLibrary() {
        library = new ArrayList<>();
    }

    public void addSong(Song song) {
        library.add(song);
    }

    public void displayLibrary() {
        for (int i = 0; i < library.size(); i++) {
            System.out.println((i + 1) + ". " + library.get(i));
        }
    }

    public Song getSong(int index) {
        if (index >= 0 && index < library.size())
            return library.get(index);
        return null;
    }

    public List<Song> getLibrary() {
        return library;
    }
}