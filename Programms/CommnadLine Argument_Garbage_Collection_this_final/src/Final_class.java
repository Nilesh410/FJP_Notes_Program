final class ABC
{
	int num;
	void display()
	{
		System.out.println("Hello JAVA");
	}
}
public class Final_class{

	public static void main(String[] args)
	{
		ABC a1=new ABC();
		a1.num=10;
		System.out.println(a1.num);
		a1.display();

	}

}
