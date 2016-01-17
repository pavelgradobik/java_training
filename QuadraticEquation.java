package homeworkLevel1;

import java.util.Scanner;

public class QuadraticEquation {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("введите первый коеффициент");
		
		int firstCoefficient = scan.nextInt();
		
		if(firstCoefficient == 0) {
		
			System.out.println("Первый коэффициент не может быть 0");
						
		} else {
			
			System.out.println("введите второй коефициент");
			
			int secondCoefficient = scan.nextInt();
			
			System.out.println("введите третий коефициент");
			
			int thirdCoefficient = scan.nextInt();
			
			int underSqrt = secondCoefficient * secondCoefficient - 4 * firstCoefficient * thirdCoefficient;
			if(underSqrt < 0){
				System.out.println("Нет действительных решений уравнения");
			} else {
				double x1 = (-secondCoefficient - Math.sqrt(underSqrt)) / (2 * firstCoefficient);
				double x2 = (-secondCoefficient + Math.sqrt(underSqrt)) / (2 * firstCoefficient);
				System.out.print((int)x1);
				System.out.print(" ");
				System.out.print((int)x2);
						
					}
			}
		
	}

}
