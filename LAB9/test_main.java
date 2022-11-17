package LAB9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test_main {
    public static void main(String[] args) {
       /*  //first Test !!ACHIEVED
        Song song = new Song("Test", "artist1", "Red", 347, 10000000); 
        //System.out.println(song);

        //test 2
         Song song1 = new Song("Test", "artist1", "Red", 600, 10000000); Song song2 = new Song("Test2", "artist2", "Red2", 106, 23555); System.out.println(song);
        ArrayList<Song> songs = new ArrayList<Song>(); songs.add(song1);
        songs.add(song2);
        Playlist playlist = new Playlist("Red Season","Taylor Swift","Fall Songs",songs); System.out.println(playlist);  */ 

        //main
        String[] genreSongs = new String[]{"0-Country" ,"1-Electronic", "2-Pop Music", "3-Rock Music", "4-Jazz", "5-Classical"};
        String preference = "";
        Playlist tempPlaylist = new Playlist();
        ArrayList<Playlist> allPlaylists = new ArrayList<Playlist>();
        
        do
        {
            System.out.println("-------------------------------------------------------- \n" +
                "Welcome to Music App! Get Ready to create your playlist!\n"+
                    " --------------------------------------------------------");
            System.out.println("1 - Create a new Playlist\n"+
            "2 - Display the Playlist\n"+
            "3 - Sort the Playlist\n"+
            "4 - Remove song by index from the current Playlist\n" +
            "5 - Display all Playlists\n"+
            "6 - Exit");    
            Scanner in = new Scanner(System.in);
            preference = in.nextLine();

            if (Integer.parseInt(preference) == 1)
            {
                Playlist newPlaylist = new Playlist();
                allPlaylists.add(newPlaylist);
                System.out.print("How many songs do you want to add to playlist?: ");
                String numberOfSongs = in.nextLine();
                for(int i=0; i<Integer.parseInt(numberOfSongs); i++)
                {
                    Song newSong = new Song();
                    newPlaylist.getSongs().add(newSong);

                    System.out.println("Enter artist name for Song "+ (i+1));
                    String addedSongsArtist = in.nextLine();
                    newSong.setArtist(addedSongsArtist);

                    System.out.println("Enter album name for Song " + (i+1));
                    String addedSongsAlbum = in.nextLine();
                    newSong.setAlbum(addedSongsAlbum);

                    System.out.println("Enter song name for Song " + (i+1));
                    String addedSongName = in.nextLine();
                    newSong.setTitle(addedSongName);

                    System.out.println("Enter song duration in seconds for Song " + (i+1));
                    String addedSongsDuration = in.nextLine();
                    newSong.setDuration(Integer.parseInt(addedSongsDuration));

                    System.out.println("Enter the times song has been played for Song " + (i+1));
                    String addedSongsTimes = in.nextLine();
                    newSong.setTimesPlayed(Integer.parseInt(addedSongsTimes));

                }
                System.out.println("Enter playlist name: ");
                String playlistName = in.nextLine();
                newPlaylist.setName(playlistName);

                System.out.println("Enter creator of playlist: ");
                String creatorName = in.nextLine();
                newPlaylist.setCreator(creatorName);
                
   
                System.out.println(Arrays.toString(genreSongs) + " Select genre of playlist : ");
                int selectedGenre = in.nextInt();
                newPlaylist.setGenre(genreSongs[selectedGenre]); 

                tempPlaylist = newPlaylist;
 
            }

            if (Integer.parseInt(preference) == 2)
            {
                System.out.println(tempPlaylist);
            }

            if (Integer.parseInt(preference) == 3)
            {
                tempPlaylist.sortByDurationSecs();
                System.out.println(tempPlaylist);
            }

            if (Integer.parseInt(preference) == 4)
            {
                System.out.println("Which song do you want to remove? (Remove by index) ");
                int index = in.nextInt();
                tempPlaylist.getSongs().remove(index);
            }

            if (Integer.parseInt(preference) == 5)
            {
                System.out.println("All Playlists: ");
                System.out.println(allPlaylists.toString());
            }
        }

        while (Integer.parseInt(preference) != 6);
        
         
    }
    
}
