package pack1;

public class Check_two_arrays_are_equal {

	public static void main(String[] args) {
		
	
	int a[] = {1,2,4,5};
	int b[]=   {1,2,4,5};
	int sum1=0;
	int sum2=0;
	for(int i=0;i<a.length-1;i++) {
	       sum1=sum1+ a[i];
	}
		for(int j=0;j<b.length-1;j++) {
			sum2=sum2+a[j];
		}		//if(a[i]==b[j]) {
			if(sum1==sum2) {
				System.out.println("this two arrays are equal");
		
			}else {
				System.out.println("this two arrays are not equal");
			//return;
			}
		}
	
	}	
	
	
	
	

