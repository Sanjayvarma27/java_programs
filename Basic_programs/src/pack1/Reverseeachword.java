package pack1;

import java.util.Scanner;

public class Reverseeachword {

	public static void main(String[] args) {
		
		String s = "Sanjay varma";
	String word []=	s.split("\\s");
		
	String reverse= " ";
	String reverseword= "" ;
	for(String i:word) {
	
		StringBuffer sb = new StringBuffer(i);
		sb.reverse();
		
	reverseword=reverseword+	sb.toString()+" ";
		
	}
System.out.println(reverseword);
}
}