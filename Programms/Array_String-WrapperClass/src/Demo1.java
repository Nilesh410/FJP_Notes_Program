public class Demo1 {
	public static void main(String[] args)
	{
		String s="PICT";
		System.out.println("s="+s);
		String str="College";
		s=s+"College";
		System.out.println("s="+s);
		String s1="PICTCollege";
		System.out.println("s1="+s1);
		String s2="PICT";
		System.out.println("s2="+s2);
		String s3="PICTCollege";
		System.out.println("s3="+s3);

		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s==s3);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(str==s2);
		
		
	}

}
