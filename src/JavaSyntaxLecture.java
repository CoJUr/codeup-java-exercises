public class JavaSyntaxLecture {

    public static void main(String[] args) {


        int weight;
        String breed;

        weight = 10;
        breed = "Cavalier King Charles Spaniel";

        String name = "Grinch";

        int cutenessFactor;
        cutenessFactor = 10;

        System.out.println(name + " is a " + weight + " pount " + breed);

//    if (cuteness factor > 8) {
//
//
//    } else {
//
//    }

        byte smol = 12;
        System.out.println(smol);

        long big = 9000000000L;
        System.out.println(big);

//    big = smol;
        System.out.println(big);


        smol = (byte) big;   //explicit coercion. Casting
        System.out.println(smol);


        float imafloat;
        double imadouble = 9.01234567890;
        System.out.println(imadouble);
        imafloat = (float) imadouble;
        System.out.println(imafloat);

//        imaFloat = 2.3F;

    }
}