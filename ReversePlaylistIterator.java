import java.util.List;
import java.util.NoSuchElementException;

public class ReversePlaylistIterator implements PlaylistIterator {
    private List<Song> songs;
    private int position;

    public ReversePlaylistIterator(List<Song> songs) {
        this.songs = songs;
        this.position = songs.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return songs.get(position--);
    }
}
