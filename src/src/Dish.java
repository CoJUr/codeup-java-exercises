public class Dish {
//walkthru----
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public void printSummary() {
        System.out.printf("Cost: %d  Name: %s  Recommended: %b", costInCents, nameOfDish, wouldRecommend);
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public void getCostInCents() {
        System.out.println("%n");
    }
//--------
//    public int costInCents;
//    public String nameOfDish;
//    public boolean wouldRecommend;
//    public String flavor;
//
//
//
//    public Dish() {}
//
//    public Dish(int costInCents, String nameOfDish, boolean wouldRecommend, String flavor) {
//        this.costInCents = costInCents;
//        this.nameOfDish = nameOfDish;
//        this.wouldRecommend = wouldRecommend
//    }
//    public void printSummary() {
//        System.out.printf("Cost: %d Name: %s Recommended: %b", this.costInCents, this.nameOfDish, this.wouldRecommend);
//    }

}
