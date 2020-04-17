import java.util.Scanner;

public class Main {
  public static void announceTeaTime() {
    System.out.println("Waiting for developer tea time");
    Scanner input = new Scanner(System.in);
    input.next();

  }

  public static void main(String[] args) {
    announceTeaTime();
    System.out.println("It's now developer tea time!");
  }
}
