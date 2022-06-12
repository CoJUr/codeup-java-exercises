package masterclass;

public class DayOfTheWeekCh {


    public static void main(String[] args) {

        printDayOfTheWeek(6);
        printDayOfTheWeek(3);
        printDayOfTheWeek(0);
        printDayOfTheWeek(8);

    }




    public static void printDayOfTheWeek(int day) {

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        }else if (day == 2) {
            System.out.println("Tues");
        }else if (day == 3) {
            System.out.println("Wed nes day");
        }else if (day == 4) {
            System.out.println("Thurs");
        }else if (day == 5) {
            System.out.println("Fridizzle");
        }else if (day == 6) {
            System.out.println("SATURDAY");
        } else {
            System.out.println("Does not compute");
        }
//        switch (day) {
//            case 1:
//                System.out.println("Its mon");
//                break;
//            case 2:
//                System.out.println("Its Tuesday");
//                break;
//            case 3:
//                System.out.println("happy wed nes day");
//                break;
//            case 4:
//                System.out.println("Its Th");
//                break;
//            case 5:
//                System.out.println("TGIF");
//                break;
//            case 6:
//                System.out.println("Its the best day ever -- SATTTT");
//                break;
//            case 7:
//                System.out.println("Obviously its the 7th day - \"funday\" ");
//                break;
//            default:
//                System.out.println("NOT VALID DAY");



    }
}


