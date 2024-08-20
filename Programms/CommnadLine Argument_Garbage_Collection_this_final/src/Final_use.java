final class Xyz
{
	static int num=10;
	static void modified(int n)
	{
		num=n;
		System.out.println(num);
	}
	 void modified(int n,int n1)
	{
		num=n+n1;
		System.out.println(num);
	}
}
public class Final_use {
    /*static void modified(int n,int n1,int n2)
    { 
    	num=n+n1+n2;
    	System.out.println(num);
    }*/
	public static void main(String[] args) {
		Xyz x1=new Xyz();
		//Final_use x1=new Final_use();
		Xyz.modified(5);
		x1.modified(5,3);
	}

}
