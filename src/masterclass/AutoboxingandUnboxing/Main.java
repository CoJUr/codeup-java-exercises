package masterclass.AutoboxingandUnboxing;

import java.util.ArrayList;

class IntClass { //made this to create an ArrayList of IntClass
    private int myValue;

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public IntClass(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {


    public static void main(String[] args) {


        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("tim");

        //cant do this because primitive type
//        ArrayList<Integer> intArrayList = new ArrayList<int>();

        //can do this tho
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();


        intClassArrayList.add(new IntClass(54));
        //first El in the ArrayList is now an obj of type IntClass with the value 54


        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i)); //converting the value of i into an Integer class. aka AUTOBOXING
//            System.out.println(intArrayList);
        }

        for (int i = 0; i < 10; i++) {
//            System.out.println(i + " --> " + intArrayList.get(i).intValue()); //converting i back into an int from a class. UNBOXING         }
        }

        //dont actually need to do line 43. just do:
        Integer myIntValue = 56;
        //^because compiler converts it to: Integer.valueOf(56)

//        int myInt = myIntValue;
        // ^how does the object go into the primitive type var?
        //A: compiler translates it to:
        int myInt = myIntValue.intValue(); // .intValue returns an int!

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double i = 0.0; i < 10.0; i+= 0.5) {
            myDoubleValues.add(Double.valueOf(i)); //autoboxing. converting primitive double to object wrapper
            System.out.println(myDoubleValues);
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue(); // returns a double. unboxing. converting back into primitive from object
            System.out.println(i + " ---> " + value);

        }

    }
}
