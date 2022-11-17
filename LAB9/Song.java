package LAB9;

public class Song implements Comparable <Song>{
    private String title;
    private String artist;
    private String album;
    private int duration;
    private int timesPlayed;

    public Song(String aTitle, String anArtist, String anAlbum, int theDuration, int theTimesPlayed)
    {
        this.title = aTitle;
        this.artist = anArtist;
        this.album = anAlbum;
        this.duration = theDuration;
        this.timesPlayed = theTimesPlayed;
    }

    public Song()
    {}

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTimesPlayed() {
        return this.timesPlayed;
    }

    public void setTimesPlayed(int timesPlayed) {
        this.timesPlayed = timesPlayed;
    }

    public int compareTo (Song Asong)
    {
        int result;
        if (this.duration > Asong.duration)
        {
            result = 1;
        }
        if (this.duration < Asong.duration)
        {
            result = -1;
        }
        else {result = 0;}
        return result;
    }

    public int compare(Song song1, Song song2)
    {
        return song1.duration - song2.duration;
    }

    public String toString()
    {
        return "*********************************\n" + "Song Name: " + getTitle() + "\nArtist Name: " + getArtist() 
            + "\nAlbum Name: " + getAlbum() + "\nDuration: " + getDuration() + "\nTimes Played: " + getTimesPlayed() + "\n";
    }
}
