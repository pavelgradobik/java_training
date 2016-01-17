package homeworkLevel1;

import java.util.Scanner;

public class SayHello {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Введите имя");
		
		String fullName = scan.nextLine();
		
		System.out.println("Hello " + fullName);
		
	}

}
