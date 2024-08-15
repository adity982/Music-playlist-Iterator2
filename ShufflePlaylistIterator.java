import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class ShufflePlaylistIterator implements PlaylistIterator {
    private List<Song> shuffledSongs;
    private int position;

    public ShufflePlaylistIterator(List<Song> songs) {
        this.shuffledSongs = new ArrayList<>(songs);
        Collections.shuffle(shuffledSongs, new Random());
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < shuffledSongs.size();
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No such element exists");
        }
        return shuffledSongs.get(position++);
    }
}

