package pack1;

public class Count_Numbers {

	public static void main(String args[]) {
	
		System.out.println("count the number");
		
		int num= 123;
		int count=0;
		
		while(num>0) {
		//num=num+	num%10;
		num= num/10;
		count++;
		}
		System.out.println(count);
System.out.println("count2");
	}
}