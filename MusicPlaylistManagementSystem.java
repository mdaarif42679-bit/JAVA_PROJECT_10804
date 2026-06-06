import java.util.Random;

// Song Class
class Song {
    private String title;
    private String artist;

    // Constructor
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // Getter Methods
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    // Display Song Details
    @Override
    public String toString() {
        return title + " - " + artist;
    }
}

// Playlist Class (Aggregation)
class Playlist {
    private Song[] songs;
    private int count;

    // Constructor
    public Playlist(int size) {
        songs = new Song[size];
        count = 0;
    }

    // Add Song Method
    public void addSong(Song song) {
        if (count < songs.length) {
            songs[count] = song;
            count++;
            System.out.println("Added: " + song);
        } else {
            System.out.println("Playlist is full!");
        }
    }

    // Display Playlist
    public void displayPlaylist() {
        if (count == 0) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("\nPlaylist Queue:");
        int index = 1;

        for (Song song : songs) {
            if (song != null) {
                System.out.println(index + ". " + song);
                index++;
            }
        }
    }

    // Fisher-Yates Shuffle Algorithm
    public void shufflePlaylist() {
        Random random = new Random();

        for (int i = count - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            Song temp = songs[i];
            songs[i] = songs[j];
            songs[j] = temp;
        }

        System.out.println("\nPlaylist Shuffled Successfully!");
    }
}

// Main Class
public class MusicPlaylistManagementSystem {

    public static void main(String[] args) {

        Playlist playlist = new Playlist(10);

        // Adding Songs
        playlist.addSong(new Song("Believer", "Imagine Dragons"));
        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd"));
        playlist.addSong(new Song("Perfect", "Ed Sheeran"));
        playlist.addSong(new Song("Levitating", "Dua Lipa"));

        // Original Playlist
        System.out.println("\n===== ORIGINAL PLAYLIST =====");
        playlist.displayPlaylist();

        // Shuffle Playlist
        System.out.println("\nShuffling Playlist...");
        playlist.shufflePlaylist();

        // Display Shuffled Playlist
        System.out.println("\n===== SHUFFLED PLAYLIST =====");
        playlist.displayPlaylist();
    }
}