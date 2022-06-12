package masterclass;

public class Sum3AndFiveCh {


    public static void main(String[] args) {

        int count = 0;
        int limit = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count += i;
                System.out.println("Added a number! i was :" + i + "  so the count is now  count: " + count);
               limit++;
               if (limit == 5) break;
//
//                for (int j = 0; j < 5; j++) {
//                    System.out.println("j should have incremented... j = " + j);
//                    break;
                }
            }  //execution then continues here, after for loop
        System.out.println(" final count = " + count);
        }
    }

