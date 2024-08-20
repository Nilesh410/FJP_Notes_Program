
public class Switch_case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=20;
		int choice=5;
		int result=0;
		
		result=switch(choice)
		{
			case 1->a+b;
			case 2->a-b;
			case 3->a*b;
			case 4->a/b;
			case 5-> {
				      int fact=1;
				      for(int i=1;i<=a;i++)
			          {
			        	fact=fact*i;
			           }
				      yield fact;
			         }
			default->0;
			
		};
		System.out.println("result="+result);

	}

}
