package masterclass;

public class Switch {
    public static void main(String[] args) {
        int value = 3;
        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("not 1 or 2");
        }


        int switchValue = 3; // can do a switch with byte short char and int

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("WAS a 3 or 4 or 5.");
                System.out.println("it was actually a " + switchValue);
//                break;     fallthrough!
            default:
                System.out.println("was not 1 or 2");
                break; //technically dont need this last one
        }
        //create a new switch using char. create new char var. create a switch testing for A B C D or E. display message if any found. default: not found

        char charSwitch = 'C';

        switch (charSwitch) {
            case 'A':
                System.out.println("Found an " + charSwitch);
                break;
            case 'B':
                System.out.println("Found a " + charSwitch);
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Found a C, D or E");
                System.out.println("was a " + charSwitch + " to be exact");
                break;
            default:
                System.out.println("Nothing found...");
                break;





            }
        String month = "JANUARY";

        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Its Jan");
                break;
            case "february":
                System.out.println("Its feb");
                break;
            case "march":
                System.out.println("happy March");
                break;
            case "june":
                System.out.println("Its hot");
                break;
            default:
                System.out.println("I don't know what year it even is");

        }
        }
    }


