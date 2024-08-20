import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int i;
	       Scanner input=new Scanner(System.in);
	       System.out.println("Enter the value of i of type int=");
	       
	       if(input.hasNextInt())
	       {
	          i=input.nextInt();
	          System.out.println("you entered="+i);
	          System.out.println("Enter another int=");
	          i=input.nextInt();
	          System.out.println("you entered="+i);
	       }
	       else
	       {
           System.out.println("You Entered wrong type of value");
	       }
	       } 

}
