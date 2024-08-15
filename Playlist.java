import java.util.ArrayList;
import java.util.List;

public class Playlist implements PlaylistAggregate {
    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public PlaylistIterator createInOrderIterator() {
        return new InOrderPlaylistIterator(songs);
    }

    @Override
    public PlaylistIterator createReverseIterator() {
        return new ReversePlaylistIterator(songs);
    }

    @Override
    public PlaylistIterator createShuffleIterator() {
        return new ShufflePlaylistIterator(songs);
    }
}
