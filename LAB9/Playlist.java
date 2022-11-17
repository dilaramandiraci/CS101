package LAB9;

import java.util.ArrayList;
import java.util.Collections;


public class Playlist {
    private String name;
    private String creator;
    private String genre;
    private ArrayList<Song> songs = new ArrayList<Song>(); 

    public Playlist()
    {
        this.name = null;
        this.creator = null;
        this.genre = null;
    }

    public Playlist(String aName, String aCreator, String aGenre, ArrayList<Song> allSongs)
    {
        this.name = aName;
        this.creator = aCreator;
        this.genre = aGenre;
        this.songs = allSongs; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void addSong(Song aSong)
    {
        songs.add(aSong);
    }

    public boolean songExists(Song aSong)
    {
        return songs.contains(aSong);
    }

    public void removeSong(Song aSong)
    {
        songs.remove(aSong);
    }

    public void sortByDurationSecs()
    {
        Collections.sort(songs);
    }

    public String toString()
    {
        return "-----------------------------------\n" + "Playslist Name: " + getName() + "\nCreator Name: " + getCreator()
            + "\nGenre: " + getGenre() + "\n-----------------------------------\n" + getSongs();
    }
    

} 
      



