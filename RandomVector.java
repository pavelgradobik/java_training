package homeworkLevel2;

public class RandomVector {
	public static void main(String[] args){
		
		int [] vector = new int [10];
		
		fillVectorByRandom(vector);
		
	}
	
	
	public static void fillVectorByRandom(int[] vector){
		for(int i = 0; i < 10; i++) {
			vector[i] = (int)(Math.random()* 10);
			System.out.print(vector[i] + ", ");
		}
		
		
	}
	
}
