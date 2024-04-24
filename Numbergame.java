import java.util.Random;
import java.util.Scanner;

public class Numbergame
{
  public static void main(String args[])
  { 
    Random rand = new Random();
    int NumberToGuess = rand.nextInt(100)+1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to the Number guessing game!!");
    System.out.println("Guess a number Between 1 to 100 numbers:");
    
    while(true)
    {
      int guess = sc.nextInt();
      
      if(guess == NumberToGuess)
      {
        System.out.println("Congratulations!!,You guessed the correct number!!");
        break;
      }
      else if(guess<NumberToGuess)
      {
        System.out.println("Your guess is to low.Try again:");
      }
      else
      {
        System.out.println("Your Guess is too high.Try Again:");
      }
    }
    sc.close();
  }
}
          