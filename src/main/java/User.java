import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        //input from user

        System.out.println("Make a move! Choose between rock/paper or scissors");

        while (true) {
            System.out.print("Enter your move (rock, paper, or scissors): ");
            String userInput = myInput.nextLine();

            enum Move {
                Rock, Paper, Scissors;
            }
            Move userMove;

            //when line is inputted , make move


            // if player wins end game

            String user = get

            // if player and computer draw , rematch



        }


    }
}


