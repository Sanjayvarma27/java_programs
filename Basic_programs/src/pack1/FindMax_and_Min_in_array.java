package pack1;

public class FindMax_and_Min_in_array {
public static void main(String[] args) {
	

	int a[]= {50,10,20,30,40,70};
	int max= a[0];
	int min=a[0];
	//int value1=0;
	//int value2 = 1;
//	int value = 0;
	
	  for(int i=0;i<a.length;i++) { 
		  
		  if(a[i]>max) {
			 max =a[i];
		  }
		  
	//System.out.println("the maximum value is"+ max);
	
	if(a[i]<min) {
		
		min=a[i];
	}
	  }
	System.out.println("the maximum value is"+ max);
	System.out.println("the minimum value is "+min);
	  }
		
		
	
	
}	
	


