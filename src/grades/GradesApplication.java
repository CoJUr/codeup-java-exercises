package grades;

import java.util.*;

public class GradesApplication {






    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student enrique = new Student("Enrique");
//        enrique.addGrade(8);
//        enrique.addGrade(9);
//        enrique.addGrade(9);
        //    key = username    value = object/instance
        students.put("risque", enrique);
        enrique.addGrades(new ArrayList<>(List.of(8,9,9)));


        Student celeste = new Student("Celeste");
//        celeste.addGrade(10);
//        celeste.addGrade(11);
//        celeste.addGrade(12);
        students.put("celery23", celeste);
        celeste.addGrades(new ArrayList<>(List.of(10,11,12)));


        Student zanzibar = new Student("Zanzibar");
//        zanzibar.addGrade(11);
//        zanzibar.addGrade(11);
//        zanzibar.addGrade(9);
        students.put("czar4barz", zanzibar);
        zanzibar.addGrades(new ArrayList<>(List.of(9, 11, 11)));


        Student jezzebel = new Student("Jezzebel");
//        jezzebel.addGrade(9);
//        jezzebel.addGrade(13);
//        jezzebel.addGrade(10);
        jezzebel.addGrades(new ArrayList<>(List.of(9, 13, 10)));
        System.out.println(jezzebel.getGradeAverage());
        students.put("belawesome", jezzebel);


//        System.out.println(students);
        boolean flag = true;

            System.out.println("Welcome!\n\nHere are the GitHub usernames of our students:\n");
        do {
            //call .keySet on the hashmap variable to get a set of the key values from students
            //datatype of the keys goes in the diamond
            Set<String> gitHubUsernames = students.keySet();

            //can iterate through the Set like an arraylist
            for (String username : gitHubUsernames) {
                System.out.print("|" + username + "|\s");
            }


            System.out.println("\n\nWhat student would you like to see more information on?\n");
            Scanner sc = new Scanner(System.in);
            String chosenUsername = sc.nextLine();
            if (gitHubUsernames.contains(chosenUsername)) {
                System.out.println("\nName: " + students.get(chosenUsername).getName() + " - " + "GitHub Username: " + chosenUsername
                        + "\nCurrent Average: " + students.get(chosenUsername).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the Github username of " + "\"" + chosenUsername + ".\"");
            }
            System.out.println("\nWould you like to see another student?\n");
            String keepGoing = sc.nextLine();
            if (keepGoing.equalsIgnoreCase("no")) {
                flag = false;
                System.out.println("\nGoodbye, and have a wonderful day!");
            } else if (keepGoing.equalsIgnoreCase("yes") || keepGoing.equalsIgnoreCase("y")) {
                System.out.println("\nWhich student would you like to see more information on?\n");
            }

        } while (flag);
    }
}
