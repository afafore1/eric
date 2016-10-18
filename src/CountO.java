import java.util.Arrays;
import java.util.Scanner;

public class CountO {

	public static void main(String[] args) {
		
		int [] array = new int [101];
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the Integer between 1 - 100");
		int userInput = input.nextInt();
		
		while (userInput != 0){
			array[userInput] = array[userInput] + 1; 
			System.out.println(Arrays.toString(array));
			userInput = input.nextInt();
		}
		
		for (int i = 0; i < array.length; i++){
			if (array[i] != 0){
				System.out.println(i+ " Occurs " + array[i]);
				
			}
		}
		
		
		
	}

}
