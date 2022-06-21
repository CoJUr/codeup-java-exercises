package FundiesReview;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static int subtractTen(int num) {
        return num - 10;
    }

    public static ArrayList<Integer> multiplyAll(int multiplier, ArrayList<Integer> numbers){

        ArrayList<Integer> multipliedArrayList = new ArrayList<>();

        for (int number: numbers){
            multipliedArrayList.add(number * multiplier);
        }
        return multipliedArrayList;
    }
    public static double average(int[] arr) {
//        double sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += i;

        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return (double) sum / arr.length;
    }

//    public static ArrayList<Integer> multipleAll(int number, ArrayList<Integer> numbers){
//        numbers.replaceAll(n -> n * number);
//        return numbers;
//    } lambda expression syntax


    public static void main(String[] args) {

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);

        System.out.println(multiplyAll(7, new ArrayList<>(List.of(1, 3, 5))));
        System.out.println(average(new int[]{1, 2, 3, 4, 5}));
    }

}
