import java.util.Scanner;
public class User_Input {

	public static void main(String[] args) 
	{

       char c;
       String s1;
       System.out.println("Enter the value of string");
       Scanner obj1=new Scanner(System.in);
       s1=obj1.next();
       System.out.println("s1="+s1);
       System.out.println("Enter the value of char");
       c=obj1.next().charAt(0);
       System.out.println("c="+c);
	}

}
/*To read a character in Java, we use next() method followed by charAt(0). 
The next() method returns the next token/ word in the input as a string and 
chatAt() method returns the first character in that string.*/