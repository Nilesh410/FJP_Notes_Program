class Demo
{
	static int num;
    Demo(int num)
	{
		this.num=num;	
		}
	static void display()
	{
		System.out.println(num);
	}
	void display1()
	{
		this.display();
	}
	
}
public class This_use {

	public static void main(String[] args) {
      Demo d1=new Demo(6);
      d1.display1();
	}
}
