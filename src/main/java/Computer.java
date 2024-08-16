import java.util.Random;

public class Computer {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(3);


            String computerMove;
        if(randomNumber ==0)

            {
                computerMove = "rock";
            } else if(randomNumber ==1)

            {
                computerMove = "paper";
            } else

            {
                computerMove = "scissors";
            }
        System.out.println("Computer option " +computerMove + "!");
        }
        }

        //input from computer and produce random output





