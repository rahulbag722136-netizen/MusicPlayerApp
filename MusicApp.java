import java.util.*;

public class MusicApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MusicLibrary library = new MusicLibrary();
        MusicPlayer player = new MusicPlayer();
        Playlist playlist = new Playlist("My Playlist");

        // Sample Songs
        library.addSong(new Song("Shape of You", "Ed Sheeran", "Divide", 5));
        library.addSong(new Song("Believer", "Imagine Dragons", "Evolve", 4));
        library.addSong(new Song("Blinding Lights", "The Weeknd", "After Hours", 6));

        boolean running = true;

        while (running) {

            System.out.println("\n1. View Library");
            System.out.println("2. Play Song");
            System.out.println("3. Add to Playlist");
            System.out.println("4. View Playlist");
            System.out.println("5. Shuffle Playlist");
            System.out.println("6. Set Volume");
            System.out.println("7. Toggle Repeat");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    library.displayLibrary();
                    break;

                case 2:
                    library.displayLibrary();
                    System.out.print("Select song number: ");
                    int s = sc.nextInt();
                    Song song = library.getSong(s - 1);

                    if (song != null) {
                        try {
                            player.play(song);
                        } catch (InterruptedException e) {
                            System.out.println("Playback interrupted!");
                        }
                    } else {
                        System.out.println("Invalid selection!");
                    }
                    break;

                case 3:
                    library.displayLibrary();
                    System.out.print("Select song to add: ");
                    int p = sc.nextInt();
                    Song psong = library.getSong(p - 1);

                    if (psong != null) {
                        playlist.addSong(psong);
                        System.out.println("Song added to playlist!");
                    } else {
                        System.out.println("Invalid selection!");
                    }
                    break;

                case 4:
                    playlist.displaySongs();
                    break;

                case 5:
                    playlist.shuffle();
                    System.out.println("Playlist Shuffled!");
                    break;

                case 6:
                    System.out.print("Enter volume (0-100): ");
                    int vol = sc.nextInt();
                    player.setVolume(vol);
                    break;

                case 7:
                    player.toggleRepeat();
                    break;

                case 8:
                    System.out.println("Exiting Music Player...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();   // ✅ Scanner properly closed
    }
}