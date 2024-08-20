
public class String_Buffer {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("PICTCollege");
		System.out.println(s);
		
		//length
	    System.out.println(s.length());
		
	    //capacity
	    System.out.println(s.capacity());
		
	    //charAt(index)
		System.out.println(s.charAt(3));
		
		//append
		System.out.println(s.append("Student"));
		System.out.println(s);
		
		//delete(start,end)
		System.out.println(s.delete(4,11));
		System.out.println(s);
	
		//insert(offeset, value)
		System.out.println(s.insert(2, "ABCD"));
		System.out.println(s);
	
		//reverse()
		System.out.println(s.reverse());
		System.out.println(s);

	}

}
