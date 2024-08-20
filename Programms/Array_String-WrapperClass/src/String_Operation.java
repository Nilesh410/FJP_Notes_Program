
public class String_Operation {

	public static void main(String[] args) 
	{
		//String object//String Literals
       String s1="Welcome in PICT";
       String s2="Welcome in PICT";
       
      //New way to create string object //String Object
       String s3=new String("ABC");
       String s4=new String("ABC");
       
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s4);
       
       String [] splittedstring=s1.split(" ");
       for(String s:splittedstring)
       {
    	   System.out.println(s);
       }
       
       
	}

}
