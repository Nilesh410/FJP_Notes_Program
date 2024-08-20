
public class Wrapper_class2 {

	public static void main(String[] args) {
		//Autoboxing
		int a=1000;
		Integer b=a;
		System.out.println(b);//b=1000 object type
		
		//Boxing
		int x=90;
		Integer y=Integer.valueOf(x);
		System.out.println(y);//y=90 object type
		
		
		//Unboxing
		Integer result=100;
	
		int newresult=result.intValue();
		System.out.println(newresult);//newresult=100 primitive type
		
		//Autounboxing
		Integer result1=100;
		int newresult1=result1;
		System.out.println(newresult1);//newresult1=100 primitive type
	}
	

}

     
   
