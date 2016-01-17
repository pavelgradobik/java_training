package homeworkLevel1;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("введите число");
		
		int digit = scan.nextInt();
		
		if((digit % 2 != 0) & (digit / 1 == digit ) & (digit % 2 != 0)){
			System.out.println("нечетное");
		} else {
			System.out.println("четное");
		}
		
	}

}
