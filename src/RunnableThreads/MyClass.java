package RunnableThreads;

public class MyClass {

    public static void main(String[] args) {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
        }
    }
}
