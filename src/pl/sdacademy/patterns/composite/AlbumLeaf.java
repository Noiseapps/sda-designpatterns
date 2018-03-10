package pl.sdacademy.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class AlbumLeaf implements Component {
    List<Component> elements;

    public AlbumLeaf(List<Component> elements) {
        this.elements = new ArrayList<>(elements);
    }

    @Override
    public int songCount() {
        int count = 0;
        for (Component element : elements) {
            count += element.songCount();
        }
        return count;
    }

    @Override
    public int songLength() {
        int length = 0;
        for (Component element : elements) {
            length += element.songLength();
        }
        return length;
    }
}
