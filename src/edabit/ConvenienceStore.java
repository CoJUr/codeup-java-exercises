package edabit;

public class ConvenienceStore {
    //Given a total due and an array representing the amount of change you have
    //determine if can or can't pay for the item. change represented in order:
    //[0] = quarters  [1] = dimes  [2] = nickles    [3] = pennies
    // changeEnough([25, 20, 5, 0], 4.25) should return true since have $8.50



//    public static boolean changeEnough(int[] change, double amountDue) {
                        //1
                //        double[] value = new double[] {0.25, 0.10, 0.05, 0.01};
                //
                //        boolean result = IntStream.range(0, change.length)
                //                .mapToDouble(i -> change[i] * value[i])
                //                .sum() >= amountDue;
                //        System.out.println(result);
                //        return result;

        //2
//        return change[0] * 25 + change[1] * 10 + change[2] * 5 + change[3] >= amountDue * 100;

                //3
        //        int noOfQuarter = change[0];
        //        int noOfDime = change[1];
        //        int noOfnickel = change[2];
        //        int noOfPenny = change[3];
        //
        //        double pocket = (noOfQuarter * 0.25) + (noOfDime * 0.1) +
        //        (noOfnickel * 0.05) + (noOfPenny * 0.01);
        //        return pocket >= amountDue;

    public static boolean changeEnough(int[] change, double amountDue) {

        //4
        double quarter, dime, nickle, pennie, total;
        quarter = change[0] * 0.25;
        dime = change[1] * 0.10;
        nickle = change[2] * 0.05;
        pennie = change[3] * 0.01;

        total = quarter + dime + nickle + pennie;
        return total >= amountDue;

    }

    public static void main(String[] args) {
//        ConvenienceStore.changeEnough([0, 0, 20, 5], 0.75);
    }

}
