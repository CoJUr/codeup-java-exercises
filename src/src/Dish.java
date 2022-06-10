public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;
    public String flavor;



    public void printSummary() {
        System.out.printf("Cost: %d Name: %s Recommended: %b", this.costInCents, this.nameOfDish, this.wouldRecommend);
    }

}
