package homeworkLevel2;

import java.util.Scanner;

public class StarLadder {
	
	public static void main (String[] args){
			
		drawStair(10);
		
		
	}
	
	
	public static void drawStair(int height) {
		
		if(height <= 0) {
			
			System.out.println("Неверное значение высоты");
			
			return;
			
			} else {
				
				for(int i = height - 1; i >= 0; i--){
					
					for (int j = i; j < height; j++){
						System.out.print("*");
						
						
					}
					
					System.out.println();
					
				}

				
				
			
		}
				
	}

}
