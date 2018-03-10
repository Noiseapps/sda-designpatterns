package pl.sdacademy.patterns.composite;

public class SongLeaf implements Component {

    String songTitle;
    String songArtist;
    int length;

    public SongLeaf(String songTitle, String songArtist, int length) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.length = length;
    }

    @Override
    public String toString() {
        return "SongLeaf{" +
                "songTitle='" + songTitle + '\'' +
                ", songArtist='" + songArtist + '\'' +
                ", length=" + length +
                '}';
    }

    @Override
    public int songCount() {
        return 1;
    }

    @Override
    public int songLength() {
        return length;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getSongArtist() {
        return songArtist;
    }
}
