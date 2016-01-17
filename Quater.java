package homeworkLevel1;

import java.util.Scanner;

public class quater {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("введите координату Х ");
		int xcoord = scan.nextInt();
		System.out.println("введите координату Y ");
		int ycoord = scan.nextInt();
		
		if(xcoord > 0 & ycoord > 0) {
			System.out.println(1);
		} else if (xcoord < 0 & ycoord > 0 & xcoord + ycoord !=0 ) {
			System.out.println(2);
		} else if (xcoord < 0 & ycoord < 0) {
			System.out.println(3);
		} else if (xcoord > 0 & ycoord < 0 & xcoord + ycoord != 0) {
			System.out.println(4);
		} else {
			System.out.println(0);
		}
		
	}
	

}
