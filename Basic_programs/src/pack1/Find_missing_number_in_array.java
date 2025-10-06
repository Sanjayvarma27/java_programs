package pack1;

public class Find_missing_number_in_array {

	public static void main(String[] args) {
		
	
	int a []= {1,2,4,5};
	int sum1=0;
	int total=15;
	for(int i=0;i<a.length;i++) {
		sum1=sum1+a[i];
	}
	
	//System.out.println(sum1);
	System.out.println("The missing number is "+ (total-sum1));
	}
	
}
