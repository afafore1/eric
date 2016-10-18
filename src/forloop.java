import java.math.BigInteger;

public class forloop {

	public static void main(String[] args) {
		//long max = Long.parseLong("10000000000");
		BigInteger max = new BigInteger("10000000000");
		BigInteger sum = BigInteger.ZERO;
		BigInteger two = new BigInteger("2");
		long start = System.currentTimeMillis(); 
		sum = max.divide(two).multiply(max.divide(two).add(BigInteger.ONE));
		long end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println("Time taken "+(end - start)+" ms");
	}

}
