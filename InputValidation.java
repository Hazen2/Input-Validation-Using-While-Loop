import java.util.Scanner;

/**
 * This simple program will validate input using the while loop.
 * The user will be asked to enter a number in the range of 10 through 24.
 * Anything outside of this range will be looped and the user will be required
 * to try again.
 */

public class InputValidation
{
  public static void main(String[] args)
  {
 
    // Declare variables
    int num; // number inputted.
    final int MIN_NUM = 10; // Minimum number of 10.
    final int MAX_NUM = 24; // Maximum number of 24.
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter a number between 10 and 24.");
    num = keyboard.nextInt();    
    
    // Check to see if the number entered was within 10 and 24.
    while (num < MIN_NUM || num > MAX_NUM)
    {
      System.out.println("Invalid entry. Number must be less than 10 or " +
                         "greater than 24.");
      // Run if number entered is less than the minimum.
      if (num < MIN_NUM)
      {
       System.out.println("The number entered is below the minimum.");
      }
      // Run if the number entered is over the maximum.
      else if (num > MAX_NUM)
      {
        System.out.println("The number entered is above the maximum."); 
      }
      
      System.out.println("Enter another number.");
      num = keyboard.nextInt();
    }
    
    // Successful number entry.
    System.out.println("Good job! The number you entered was: " + num + ".");
      
    
    
  }
}
