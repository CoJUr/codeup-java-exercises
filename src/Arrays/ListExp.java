package Arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListExp {

    public static void main(String[] args) {

        ArrayList<String> citiesList = new ArrayList<>();

        citiesList.add("Delhi");
        citiesList.add("Mumbai");
        citiesList.add("Paris");
        citiesList.add("Rome");
        citiesList.add("New york");

        System.out.println("Elements of ArrayList are:");
        ListIterator<String> listItr = citiesList.listIterator();

        while (listItr.hasNext()) {
            String ele = listItr.next();
            System.out.println(ele);
        }

        System.out.println("Elements of ArrayList in reverse order are:");
        ListIterator<String> listItr2 = citiesList.listIterator(citiesList.size());

        while (listItr2.hasPrevious()) {
            String ele = listItr2.previous();
            System.out.println(ele);
        }


    }
}
