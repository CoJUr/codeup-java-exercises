package masterclass.RegEx;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am";
        System.out.println(string);

        //use replaceall method for replacing I with you
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);


        //character classes and boundary methods.
        //Character Classes; like a wild card - reps a set or class of characters
        // boundary methods: looks for beginning/end of things, aka boundaries


        String alphanumeric = "abcDeeeF12Ghhiiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));
        //        character class '.' matches any character    so get YYYYYYYYYYYYYY

        //shift + 6 current boundary matcher.   replacing abcDeee substring with 3 Y's: length doesn't have to match
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

//      2nd occurrence of abcDeee doesnt get replaced bc ^ only looks at start
        String secondString = "abcDeeeF12GhhabcDeeeiiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));


        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        //with .matches(), the whole string has to match in order for truthy return. don't need ^
        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiiijkl99z"));

//        $ boundary matcher:   always PREceeded by pattern. opposite of ^ in that its matching endings
        System.out.println(alphanumeric.replaceAll("l99z$", "THE END"));


//        to match specific characters or set of chars, use brackets
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));

        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
        //each a, e and i each get replaced by the 2nd param

//        if want to replace the same letters, BUT only if followed by f or j:
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
//        one of the letters has to be followed by an F OR a j in order for event to occur

    }
}
