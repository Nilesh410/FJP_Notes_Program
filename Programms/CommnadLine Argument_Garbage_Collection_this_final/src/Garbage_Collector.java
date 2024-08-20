class Test
{
	int num;
	void display()
	{
		System.out.println("num="+num);
	}
	public void finalize()
	{
		System.out.println("invoked finalize method");
	}
}
public class Garbage_Collector {
	public static void main(String[] args) 
	{
         Test t1=new Test();
         t1.num=10;
         t1.display();
         t1=null;
         System.gc();
         t1.display();    
 
	}
}
