package pl.sdacademy.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {

    public static void main(String[] args) {
        List<Component> songs = new ArrayList<>();
        songs.add(new SongLeaf("ABC", "ABC", 180));
        songs.add(new SongLeaf("ABCD", "ABC", 180));
        songs.add(new SongLeaf("ABC@", "ABC", 180));
        songs.add(new SongLeaf("ABCA", "ABC", 180));
        AlbumLeaf leaf = new AlbumLeaf(songs);
        songs.add(leaf);
        songs.add(new SongLeaf("ABCA656556", "ABC", 180));


        AlbumLeaf root = new AlbumLeaf(songs);

        System.out.println(root.songCount()); // 8
        System.out.println(root.songLength()); // 1440

        System.out.println(root);
    }
}
