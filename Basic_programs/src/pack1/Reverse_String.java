package pack1;

public class Reverse_String {

	public static void main(String args[]) {
		
		String s1 = "sanjay";
		String rev= "";
		
	int len = 	s1.length();
		
		
		for(int i=len-1;i>=0;i--) {
		
			rev=rev+s1.charAt(i);
			
	}
System.out.println(rev);
	}
	}
