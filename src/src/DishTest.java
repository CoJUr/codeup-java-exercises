public class DishTest {


    public static void main(String[] args) {
        Dish dish = new Dish();
        Dish dish1 = dish;

        dish1.flavor = "catlike";
        dish1.costInCents = 9000;
        dish1.nameOfDish = "Cat meat platter";
        dish1.wouldRecommend = true;

        dish1.printSummary();

    }
}
