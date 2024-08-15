public interface PlaylistAggregate {
    PlaylistIterator createInOrderIterator();
    PlaylistIterator createReverseIterator();
    PlaylistIterator createShuffleIterator();
}

