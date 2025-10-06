package pack1;

public class Remove_junk {
public static void main(String[] args) {
	String s = "Sanjayvarma!@#!#$";
String s1= 	s.replaceAll("[^A-z,1-10]","");
	
	System.out.println(s1);
}
}