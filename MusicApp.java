public class MusicApp {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song 1", "Artist 1"));
        playlist.addSong(new Song("Song 2", "Artist 2"));
        playlist.addSong(new Song("Song 3", "Artist 3"));

        PlaylistIterator inOrderIterator = playlist.createInOrderIterator();
        System.out.println("In-Order Playlist:");
        while (inOrderIterator.hasNext()) {
            System.out.println(inOrderIterator.next());
        }

        PlaylistIterator reverseIterator = playlist.createReverseIterator();
        System.out.println("\nReverse Playlist:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        PlaylistIterator shuffleIterator = playlist.createShuffleIterator();
        System.out.println("\nShuffled Playlist:");
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }
    }
}
