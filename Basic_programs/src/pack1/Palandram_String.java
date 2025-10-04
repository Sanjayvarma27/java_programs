package pack1;

public class Palandram_String {

	public static void main(String args[]) {
		
		System.out.println("Stringpalandram");
		
		String s1 = "SaS";
	String Org_string=	s1;
		String rev="";
		
	int len= 	s1.length();
		
	for(int i= len-1;i>=0;i--) {
		rev= rev+s1.charAt(i);
		
	}
	System.out.println(rev);
	

	if (Org_string.equals(rev)) {
		
		System.out.println("it is palandram");
	}
	else {
		System.out.println("it is not a palandram");
	}
	
		
		
	}
	
}
