import java.util.ArrayList;

public class Array_Display2 {
    static void display(ArrayList<String> a)
    {
    	int j=0;
		for(String s:a)
		{
			System.out.println("a["+j+"]="+s);
			j++;
		}
    }
	public static void main(String[] args) 
	{
		ArrayList <String>a=new ArrayList<String>();
		a.add("");
		a.add("");
		a.add("");
		display(a);
		a.add("");
		display(a);
		
	}

}
