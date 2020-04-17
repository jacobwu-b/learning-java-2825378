import java.util.Scanner;

public class Main {
  public static double annualIncome(double hours, double wage, int daysAbsent) {
    return (hours*54 - 8*daysAbsent) * wage;
  }
  public static void main(String[] args) {
    System.out.println("How many hours does the employee work per week?");
    Scanner input = new Scanner(System.in);
    double hours = input.nextDouble();

    System.out.println("What is the employee's hourly wage?");
    double wage = input.nextDouble();

    System.out.println("How many days is the employee absent?");
    int daysAbsent = input.nextInt();

    System.out.println(annualIncome(hours, wage, daysAbsent));
  }

}
