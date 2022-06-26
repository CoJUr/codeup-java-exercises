package masterclass.Polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats people";
    }

}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        //deleting param 'String name' for polymorphism and hard coding the name passed to super again
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
        //deleted return's super statement from autogenerate again
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Forgetable extends Movie {

    public Forgetable() {
        super("Forgettable");
    }

    //no plot method/override for demonstration purpose. it will call the base class' plot()
}
public class Main {

    public static void main(String[] args) {
        //create a for 10x loop to generate random movies, calling the plot method for that specific class
        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
            //key: movie.plot()
        }
    }


    //create a method to return a random movie class
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated = " + randomNumber);

        return switch (randomNumber) {
            case 1 -> new Jaws();
            //break would be redundant because return statement first line
            case 2 -> new IndependenceDay();
            case 3 -> new MazeRunner();
            case 4 -> new StarWars();
            case 5 -> new Forgetable();
            default ->

//            default:
//                return null;
                //^ need this or below return null;

                    null;
        };

    }

}
