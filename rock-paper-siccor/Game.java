import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userChoice;

        //variable for our validChoice
        boolean validChoice = false;
        //Get uSER CHOICE
        do{
            System.out.println("Please select your move, rock/paper/scissors: ");
            userChoice = console.nextLine();
            if(userChoice.equalsIgnoreCase("rock") || userChoice.equalsIgnoreCase("paper") || userChoice.equalsIgnoreCase("scissors")){
                validChoice = true;
            } else {
                System.out.println("Error: invalid choice");
            }
        } while(!validChoice); // the loop will run as long as validchoice remains false

        //generrate compter choice
    int random = (int) Math.floor(Math.random() * 3);
    String computerChoice = null;
    switch (random) {
        case 0:
            computerChoice = "rock";
            break;
        case 1:
            computerChoice = "paper";
            break;
        case 2:
            computerChoice = "scissors";
            break;
        default: //this will never happen
            computerChoice = null;

    }
    String graphic = "LOADING";
    for(int i = 0; i < graphic.length(); i++) {
        System.out.println(graphic.charAt(i));
    }
    if (computerChoice.equalsIgnoreCase(userChoice)){
        System.out.printf("You both picked %s, it's a tie!%n", userChoice);
    } else if (computerChoice.equalsIgnoreCase("rock") && userChoice.equalsIgnoreCase("paper")){
        System.out.printf("The computer pick %s and you pick %s - You win!!! Yay!%n", computerChoice, userChoice);
    }else if (computerChoice.equalsIgnoreCase("paper") && userChoice.equalsIgnoreCase("scissors") ) {
        System.out.printf("The computer pick %s and you pick %s - You win!!! Yay!%n", computerChoice, userChoice);
    } else if (computerChoice.equalsIgnoreCase("scissors") && userChoice.equalsIgnoreCase("rock")){
        System.out.printf("The computer pick %s and you pick %s - You win!!! Yay!%n", computerChoice, userChoice);
    } else {
        System.out.printf("The computer pick %s and you pick %s - you lose! :( %n ", computerChoice, userChoice);
    }
    }


}
