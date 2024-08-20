
public class Final_Use2 {
	final int num=10;
	 int use(final int n)
	{
		//n=n+2;
		System.out.println(n*n*n);
		return n;
	}

	public static void main(String[] args)
	{
		
      Final_Use2 obj=new Final_Use2();
      int data=obj.use(5);
      System.out.println(data);
	}

}
