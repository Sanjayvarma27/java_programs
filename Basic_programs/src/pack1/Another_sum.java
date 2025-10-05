package pack1;

import java.util.Scanner;

public class Another_sum {

	public static void main(String args[]) {
	System.out.println("this is the find largest number in the sum");

	Scanner sa = new Scanner(System.in);
	int a = sa.nextInt();
	Scanner sb = new Scanner(System.in); 
	int b= sb.nextInt();
	Scanner sc= new Scanner(System.in);
int c= 	sc.nextInt();
	
	if(a>b&a>c) {
		System.out.println("a is the largest number");
		
	}
	if(b>a&b>c) {
		System.out.println("b is the largest number");
		
	}if(c>a&c>b) {
		System.out.println("c is the largest number");
	}
	
	}
	}
