import java.util.List;
import java.util.NoSuchElementException;

public class InOrderPlaylistIterator implements PlaylistIterator {
    private List<Song> songs;
    private int position;

    public InOrderPlaylistIterator(List<Song> songs) {
        this.songs = songs;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return songs.get(position++);
    }
}

