package oop;

public class Post {

    public String title;
    public String author;
    public String creationDate;
    public String body;

    static long totalPosts;

    public Post() {
        totalPosts++;
    }

    public Post(String title, String author, String creationDate, String body) {
        this();
        this.title = title;
        this.author = author;
        this.creationDate = creationDate;
        this.body = body;
    }

    public String toString() {
        return "title:\n "+ this.title +
                " \n Author: "+ this.author +
                " \n CreationDate: "+ this.creationDate +
                " \n body:  "+ this.body + " \n";
    }


    public static long getTotalPosts() {
        return totalPosts;
    }


}