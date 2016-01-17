package homeworkLevel1;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("введите первое число");
		
		int digit1 = scan.nextInt();
		
		System.out.println("введите первое число");
		
		int digit2 = scan.nextInt();
		
		int sum = digit1 + digit2;
		
		System.out.println(sum);
		
		
	}

}
