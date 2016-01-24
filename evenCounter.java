package homeworkLevel2;

public class evenCounter {
	
	public static void main(String[] args) {
		
		int [] vector = new int [10];
		System.out.println(calcNonPairCount(vector));
			
		}
	
	public static int calcNonPairCount(int [] vector) {
		
		if(vector.length > 0){
			
			int numberOfEven = 0;
			
			for(int i = 0; i < vector.length; i++) {
				vector[i] = (int)(Math.random()* 10);
				while(vector[i] % 2 != 0){
					numberOfEven = numberOfEven + 1;
				}
							
			} 	
			
				return numberOfEven;
			
		} else {
			
			System.out.println("Неверный размер вектора");
			return vector.length;
				
			} 
			
			
		}
		
		
		
	}
		

