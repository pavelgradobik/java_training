package homeworkLevel1;

import java.util.Scanner;

public class BiggerSmaller {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("введите 3 числа для сравнения");
		
		int first = scan.nextInt();
		int second = scan.nextInt();
		int third = scan.nextInt();
		
		System.out.println(Math.max(first, Math.max(second, third)) + " " + Math.min(first, Math.min(second, third)));
				
	}

}
