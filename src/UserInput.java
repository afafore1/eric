import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		addIntegers ai = new addIntegers();
		System.out.println("Input a number: ");
		int a = sc.nextInt();
		System.out.println("Input another number: ");
		int b = sc.nextInt();
		int add = ai.addNumbers(a, b);
		int div = ai.divNumbers(a, b);
		int mul = ai.mulNumbers(a, b);
		System.out.println("Addition = "+add+" Division = "+div+" Multiplication "+mul);
		
		

	}

}
