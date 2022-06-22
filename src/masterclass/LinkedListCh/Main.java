package masterclass.LinkedListCh;

import java.util.*;

public class Main {

    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to:-
    // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own).
    // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an optional extra, provide an option to remove the current song from the playlist
    // (hint: listiterator.remove()



    //create some albums, add songs to the albums,
    //ultimately create a linkedlist and add the albums to it

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Storm-bringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        album.addSong("Stormbringer", 4.6);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        //^created a new object from album
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        //now that have an arraylist with 2 albums, can add songs to playlist
        //playlist is a linkedlist
        LinkedList<Song> playList = new LinkedList<Song>();

        albums.get(0).addToPlayList("You can't do it right", playList);
        //title has to match exactly and be a song added to that album
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList); //doesn't exist, wont work
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(0).addToPlayList(24, playList); //doesn't exist

        play(playList);


    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true; //normally when starting a playlist going forward, cant go backward from song#1
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            //need to overloaded .toString here because using a song object
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        //if not going forward, change direction TO forward
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                        //once determined songs are in playlist still, print out menu
                        printMenu();
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false; //because cant go forward
                    }
                    break;
                case 2:
                    if (forward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("we are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if(listIterator.hasPrevious()) {
                            System.out.println("Now replaying "+ listIterator.previous().toString());
                            //checked to see if theres a previous, we went to it, so set forward to false
                            //to keep track of the direction, which now is backward in order to replay song
                            forward = false;
                        } else {
                            //no previous entry
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        //not moving forward
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            //other situation: we WERE going backward, so set forward to true because had
                            //to go forward to replay the song again
                            forward = true;
                        } else {
                            System.out.println("we have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist); //show available songs
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("""
                0 - to quit
                1 - to play next song
                2 - to play previous song
                3 - to replay the current song
                4 - to list songs in the playlist5 - print available actions""");
    }


    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        //not using a list iterator b/c no need to go back/forward. using regular iterator instead
        System.out.println("=============");
        while(iterator.hasNext()) {
            System.out.println(iterator.next()); //dont need to add .toString on the end
        }
        System.out.println("============");
    }
}
