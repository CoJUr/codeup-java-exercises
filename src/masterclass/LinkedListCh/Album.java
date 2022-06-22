package masterclass.LinkedListCh;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;

    //create an arraylist of song objects
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        //initialize the arraylist
        this.songs = new ArrayList<Song>();
    }

    //add songs so that they go into the arraylist
    public boolean addSong(String title, double duration){
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
            //validation to make sure not to duplicate songs, testing the title
            //if null, song didn't exist, so can add it
        }
        //else return false because song already existed
        return false;
    }

    private Song findSong(String title) {
        for (Song checkedSong: this.songs) {
            //equivalent to doing a test for .get(i)
            //checking each song of the arraylist to make sure no duplicates
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
                //if found in the list, return that song
            }
        }
        //else, didn't find it
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        //passing in the track # we want to add
        //using track # to reference entries of the album, like index
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            //making sure there is a song in that index for this arraylist, if so add the song to the passed playlist
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //overload the method to have the ability to pass the title instead of track number
    //  -note: could have had song adding mechanism in the song class instead
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        //this time check to make sure if not null, aka found on file
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true; //found it, can add
        }
        //else
        System.out.println("The song " + title + " is not in this album");
        return false;

    }

}
