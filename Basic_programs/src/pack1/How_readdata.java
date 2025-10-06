package pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class How_readdata {

	public static void main(String args[]) throws Exception {
		
	FileReader fr = new FileReader("D:\\New folder\\readfile\\a1\\b1\\.project");
		BufferedReader br = new BufferedReader(fr);
		
		boolean str  ;
		
		while(str=br.readLine()!=null) {
			
			System.out.println(str);
			
		}
		
	}
	
}
