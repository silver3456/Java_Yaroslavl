package _02_11_2018;

public class Song implements Comparable<Song> {

    private String title;
    private String artist;

    public Song(String s, String token, String title, String artist) {
        setArtist(artist);
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                '}';
    }
}
