package pack1;

public class Find_duplicate_value {

	public static void main(String[] args) {
		
		int value []= {10,20,90,23,20};
	boolean	isduplicate =false;
		for(int i=0;i<value.length;i++) {
			
		
			for(int j=i+1;j<value.length;j++) {
			
			
		
		if(value[i]==value[j]) {
			
			System.out.println("There is a duplicate  value"+value[i]);
	isduplicate= true;
	break;
		}
		}
		if(isduplicate) {
			break;
		}
		}
		if(!isduplicate) {	
			System.out.println("There is no duplicate values");
		}
		}
	}
	
	

