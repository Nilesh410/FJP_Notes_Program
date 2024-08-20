// Update Version of switch statements
// Switch as an expression
public class Switch_case1 {

	public static void main(String[] args) 
	{
		String day="Monday";
		String result="";
		   result=switch(day)
		   {
		      case "Saturday","Sunday"->"9AM";
		          
		      case "Monday"->"7AM";
		    	 
		      default->"8AM"; 	  
		   };
		   System.out.println("result="+result);	}

}
