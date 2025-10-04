package pack1;

public class Palanadram_number {

	public static void main(String args[]) {
		
		System.out.println("enter the values");
		
		int num =121;
		int org_num= num;
		int rev=0;
		
		while(num>0) {
		rev=	rev*10+num%10;
			num=num/10;
			
			
		}
			System.out.println(rev);	
				
	
if(org_num==rev) {
	System.out.println("it is the palandram number");
}
else {
	System.out.println("it is not a palandram number");
	
}
}


}
