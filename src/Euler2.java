
public class Euler2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int temp = 0;
		int sum = 0;
		long start = System.currentTimeMillis();
		while(b < 400000000){
			if(b % 2 == 0)sum+=b;
			temp = a+b;
			a = b;
			b = temp;
		}
		long end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println("Time taken is "+(end - start)+" ms");

	}

}
