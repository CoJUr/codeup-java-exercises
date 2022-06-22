package masterclass.LinkedListCh;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    //generate an override for toString method for this class instances
    @Override
    public String toString() {
//        return super.toString(); *default from generate*
        return this.title + ": " + this.duration;
        //prints out the contents of the object
    }
}
