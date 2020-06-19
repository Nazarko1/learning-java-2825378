import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String question = "Which football team is the best in Lviv?";
        String choiceOne = "FC Lviv";
        String choiceTwo = "FC Karpaty";
        String choiceThree = "FC Rukh";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        // Retrieve the user's input
        String usersAnswer = scanner.nextLine();

        // If the user's input matches the correctAnswer...
        if (usersAnswer.equals(correctAnswer)) {
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Awesome!");
        } else {
            // If the user's input does not match the correctAnswer...
            // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Are you serious? Only Lviv! Only Karpaty!");
        }

    }

}
