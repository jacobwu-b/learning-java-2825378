import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Am I cool?";
        String choiceOne = "Yes";
        String choiceTwo = "No";
        String choiceThree = "I don't know";

        String correctAnswer = choiceOne;

        // Write a print statement asking the question
        System.out.println("You have received a new question: " + question);
        // Write a print statement giving the answer choices
        System.out.println("Your choices are:\nA. " + choiceOne + "\nB. " + choiceTwo + "\nC. " + choiceThree);

        // Have the user input an answer
        // Retrieve the user's input
        System.out.println("So, what do you think?");
        Scanner input = new Scanner(System.in);
        String userResponse = input.nextLine();

        System.out.println("You think " + userResponse);

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if (userResponse.matches("Yes") || userResponse.matches("A")) {
          System.out.println("I think you are absolutely right");
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
        else {
          System.out.println("I think we have difference of opinions so I say to you, think again!");
        }

    }

}
