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
    }
}
