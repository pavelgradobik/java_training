package homeworkLevel1;

import java.util.Scanner;

public class AverageFromString {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("введите семизначное число ");
		
		String string = scan.next();
		
		int [] strToArray = new int [string.length()];
		
	    for (int i=0; i<string.length(); i++)
	       {
	    		strToArray[i]=Integer.valueOf(string.charAt(i)).intValue();
	          
	       }
	    
	    int sum = 0;
	    
	    for(int i=0; i<strToArray.length; i++) {
	        sum=sum+strToArray[i];
	        System.out.println(sum / 7);
	    }
	    
	    System.out.println(sum / 7);
	    
	}

}
