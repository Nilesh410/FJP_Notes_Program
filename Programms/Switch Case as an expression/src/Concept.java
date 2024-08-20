import java.util.Scanner;
public class Concept {

	public static void main(String[] args) {
		int a,b;
		Scanner obj=new Scanner(System.in);
         a=obj.nextInt();
         b=obj.nextInt();
         int choice=obj.nextInt();
         int result=switch(choice)
         {
         case 1,3->a+b;
                
         case 2->a-b;
         
         case 4->{
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
