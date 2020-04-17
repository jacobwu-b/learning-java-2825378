public class Main {

    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
      return listedMealPrice + listedMealPrice * (1+taxRate) + listedMealPrice * (1+tipRate);
    }

    public static void main(String[] args) {
      double groupTotalCost = calculateTotalMealPrice(15, 0.2, 0.1);
      System.out.println("Your group total is: " + groupTotalCost);
      System.out.println("Your individual total is: " + groupTotalCost/5);
    }

}