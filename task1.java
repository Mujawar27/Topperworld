package game;
import java.util.*;
public class Number {
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  int k=(int)(100*Math.random());
	  int i;
	  System.out.println("Welcome to Guess Number Game\nYou will be asked to win the Game\nYou hava maximum 5 attempt Limit");
	  for(i=1;i<6;i++)
	  {
		  System.out.println("Enter a Guess Number between 1 to 100=");
		  int n=sc.nextInt();
		  if(n<k)
			  System.out.println("Your Guess number is Smaller");
		  else if(n>k)
			  System.out.println("Your Guess number is Greater");
		  else if(n==k)
		  {
			  System.out.println("oohhoo! Your guess number is correct\n You win the game");
			  break;

		  }
	   }
	  
		   if(i==6)
			  System.out.println("You exhausted 5 trial\n The number was "+k);

	  
  }
}
