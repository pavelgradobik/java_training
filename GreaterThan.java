package homeworkLevel1;

import java.util.Scanner;

public class GreaterThan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Push the first digit");
		
		int firstDigit = scan.nextInt();
		
		System.out.println("push the second digit");
		
		int secondDigit = scan.nextInt();
		
		if(firstDigit > secondDigit) {
			System.out.println(firstDigit);
		} else {
			System.out.println(secondDigit);
		}
		
	}

}
