


public class OOPLecture {
    public static void main(String[] args) {
        oop.Post post = new oop.Post();
        oop.Post post2 = post;
//        System.out.println("post = " + post);
        System.out.println("post2 = " + post2);
        System.out.println("post = " + post);

        post2.author = "Justin";
        System.out.println("post.author = " + post.author);

        oop.Post post3 = new oop.Post("book title","first Last","11/01/1987","yes!");
        oop.Post post4 = new oop.Post("book xxx title","first Lasdast","11/02/1987","yes!");
        oop.Post post5 = new oop.Post("book xxx asdftitle","asdfasdf Last","11/01/1987","yes!");

        System.out.println("post3.author + post3.title = " + post3.author + post3.title);

        System.out.println("post3.toString() = " + post3.toString());


        // static method
        System.out.println("Post.getTotalPosts() = " + oop.Post.getTotalPosts());

        // Post.getTotalPosts()  == post3.getTotalPosts();


    }
}