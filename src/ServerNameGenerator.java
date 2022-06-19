public class ServerNameGenerator {

    static String[] array1 = {"hyphy", "sly", "dumber", "doggone", "loud-mouthed", "lazy", "colossal", "cheeky", "thicc", "scaredy"};
    static String[] array2 = {"dragon", "chicken", "Xbox", "mustache", "watcher", "plumber", "stool", "chrome-dome", "lawnmower", "snake"};

    static int randomSelector1 = (int) Math.floor(Math.random() * 10);
    static int randomSelector2 = (int) Math.floor(Math.random() * 10);

    public static String getRandom1(String[] arr) {
        return arr[randomSelector1];
    }

    public static String getRandom2(String[] arr) {
        return arr[randomSelector2];
    }

//    public static String getRandom(String[] arr) {


        //return a random element from an array of strings
//        return arr[randomSelector];

//    }

    public static void main(String[] args) {
        String retrieved = getRandom1(array1);

        String alsoRetrieved = getRandom2(array2);

        System.out.println("Here is your server name: \n" + retrieved + "-" + alsoRetrieved);
        System.out.println(randomSelector1);
        System.out.println(randomSelector2);
    }
}
