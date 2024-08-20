
public class Commandlineargument {

	public static void main(String[] args) 
	{
	
		for(int i=0;i<args.length;i++)
	      {
	        System.out.println("args["+i+"]="+args[i]);
	      }
	       System.out.println(Float.parseFloat(args[0])+Integer.parseInt(args[1]));
	}

}
