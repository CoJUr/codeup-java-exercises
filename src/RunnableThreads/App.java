package RunnableThreads;

public class App {

    public static void main(String[] args) {
        Thread ob = new Thread(new A());
        ob.start();
    }
}


