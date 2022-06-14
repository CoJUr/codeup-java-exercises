public class ArraysLec {

    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];

//        int[] numbers2 = new int[5];
        numbers[0] = 78;
        numbers[1] = 67;
        numbers[2] = 42;
        numbers[3] = -5;
        numbers[4] = -124;

        System.out.println(numbers[1]);

        String[] synonymsOfWeird = {"Strange", "bizzare", "uncanny"};
        System.out.println(synonymsOfWeird[1]);

//        enhanced for loop
        for (String synonym: synonymsOfWeird) {
            System.out.println(synonym);
        }

        //for loop
        for (int i = 0; i < synonymsOfWeird.length; i++) {
            System.out.println("The word at index " + i + " is " + synonymsOfWeird[i]);
        Monster[] monsters = {orc, blueDragon, ogre}; //have to create Monster.java first and constructor and then instantiate all 3

        }



    }


}
