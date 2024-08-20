import java.io.*;
class Addition
{
	int num=5;
	public int add(int a,int b)
	{
		Integer no=Integer.valueOf(10);
		String s=no.toString();
		System.out.println(s+b);
		return (a+b);
	}
}
public class Memory_Allocation {

	public static void main(String[] args) 
	{
      //int data=10;
      Addition obj=new Addition();
      int result=obj.add(3,2);
      System.out.println(result);

	}

}
