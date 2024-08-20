
public class Commandla2 {

	public static void main(String[] args) {
		for(int i=0;i<args.length;i++)
	      {
	           System.out.println("args["+i+"]="+args[i]);
	        } 
		System.out.println(args[0]+1);
		int num=Integer.parseInt(args[0]);
		System.out.println(num+1);		
	}

}
