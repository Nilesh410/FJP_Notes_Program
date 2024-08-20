
public class Switch3 {

	public static void main(String[] args) {
		int a=5,b=6;
		int choice=5;
		int result=0;
		
		result=switch(choice)
		{
			case 1->a+b;
			case 2->a-b;
			case 3->a*b;
			case 4->a/b;
			case 5-> {
				        int choice1=2;
				        int result1=0;
				        result1=switch(choice1)
				        {
				        case 1->{
				        	    int fact=1;
						        for(int i=1;i<=a;i++)
					            {
					        	  fact=fact*i;
					             }
						        yield fact;
				               }
				        default ->{
				        	int fact=1;
					        for(int i=1;i<=b;i++)
				            {
				        	  fact=fact*i;
				             }
					        yield fact;
				        	}
				        };
				      yield result1;
			         }
			default->0;
			
		};
		System.out.println("result="+result);


	}

}
