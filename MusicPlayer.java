public class MusicPlayer {

    private int volume = 50;     // Default volume
    private boolean repeat = false;

    // Play method
    public void play(Song song) throws InterruptedException {

        if (song == null) {
            System.out.println("No song selected!");
            return;
        }

        do {
            System.out.println("\nNow Playing: " + song.getTitle());
            System.out.println("Artist: " + song.getArtist());
            System.out.println("Album: " + song.getAlbum());
            System.out.println("Volume: " + volume);
            System.out.println("----------------------------");

            for (int i = 1; i <= song.getDuration(); i++) {
                Thread.sleep(1000);
                System.out.println("Playing... " + i + " sec");
            }

            System.out.println("Song Finished!");

        } while (repeat);  // repeat safely using loop
    }

    // Set Volume
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println("Volume set to: " + volume);
        } else {
            System.out.println("Invalid volume! Please enter between 0-100.");
        }
    }

    // Toggle Repeat Mode
    public void toggleRepeat() {
        repeat = !repeat;
        if (repeat) {
            System.out.println("Repeat Mode ON");
        } else {
            System.out.println("Repeat Mode OFF");
        }
    }

    // Optional Getter (Good Practice)
    public int getVolume() {
        return volume;
    }
}