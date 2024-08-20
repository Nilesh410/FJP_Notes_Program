import java.util.Scanner;

public class Array_Display1 {

	public static void main(String[] args) {
		String a[]=new String[5];
		System.out.println("Enter the array elements=");
		Scanner obj=new Scanner(System.in);
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.print("a["+i+"]=");
	    	a[i]=obj.next();
	    	System.out.println("");
	    }
	    System.out.println("Array elements are=");
	    int j=0;
	    for(String i:a)
	    {
	    	System.out.print("a["+j+"]="+i);
	    	System.out.println("");
	    	j++;
	    }
	}

}
