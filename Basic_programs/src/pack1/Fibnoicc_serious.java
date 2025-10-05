package pack1;

public class Fibnoicc_serious {

	public static void main(String args[]) {
		
		int n1= 0;
		int n2=1;
		int sum= n1+n2;
		System.out.println("before fibnoicc serious"+n1+n2);
	
		for(int i=1;i<10;i++) {
		
		sum =n1+n2;
		n1=n2;

         n2=sum;	
	System.out.println("After fibnoicc serious"+sum);
}
}
}