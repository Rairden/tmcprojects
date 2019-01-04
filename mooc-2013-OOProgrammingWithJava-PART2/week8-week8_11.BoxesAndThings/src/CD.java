public class CD implements ToBeStored {

    private String artist;
    private String song;
    private int year;
    private double weight;

    public CD(String artist, String song, int year) {
        this.artist = artist;
        this.song   = song;
        this.year   = year;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return artist + ": " + song + " (" + year + ")";
    }
}