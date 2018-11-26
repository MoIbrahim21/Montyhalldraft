/**
 * Mo Ibrahim
 * Pd 5 
 */
import java.util.Random;
import java.util.Scanner;
public class Montyhall{

public static void main(String[] args) {
    Scanner user = new Scanner (System.in);
    Random generator = new Random();
    int original_door; 
    int opened_door;
    int	unopened_door;
    int correct_door;

    correct_door = generator.nextInt(3)+1;
    opened_door = correct_door;

   if(opened_door == correct_door){
	   opened_door = generator.nextInt(3)+1;
    }

   unopened_door = opened_door;

    if (unopened_door == opened_door || unopened_door == correct_door){
    	unopened_door = generator.nextInt(3)+1;
    }
    System.out.println("*** Welcome to the game show! ***");  
    System.out.println("Select the door (1, 2, or 3): ");
    original_door = user.nextInt();
    if (original_door > 3 || original_door < 0) 
    {
    	System.out.println("Please select door 1, 2, or 3");
        original_door = user.nextInt();
        } 
    
    else if(original_door == 1 || original_door == 2 ||  original_door == 3) 
    {

    System.out.println("I will now show you where the prize is located,");
    System.out.println(" First, keep in mind that behind one of the other doors there are other items");

    System.out.println("Behind door number " + opened_door + " are goats!");
    System.out.println("You selected door number " + original_door);
    System.out.println("Knowing this would you like to switch your door(y/n)? ");

    char userReply = user.next().charAt(0);
    if (userReply == 'y'){ original_door = unopened_door;
    }
    if(userReply != 'y' && userReply != 'n')
    {
    System.out.println("Please enter either y/n");
    userReply = user.next().charAt(0);
    } 
    System.out.println("The prize is behind door number: " + correct_door); 
    if(original_door == correct_door)
    {
    System.out.println("Congratulations! You won the prize!");
            } 
    else {
    		System.out.println("Sorry. You lost.");
                    }       

        }
    }
}
