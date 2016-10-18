import java.util.Arrays;
import java.util.Scanner;

public class Methods {
	private int a;
	private int b;
	private int c;
	public int maxValue;
	private String name;
	public Methods()
	{
		a = 10;
		b = 20;
		maxValue = 10;
		name = "Eric";
	}
	
	public Methods(int c)
	{
		a = 30;
		b = 60;
		this.c = c;
	}
	
	public String GetName()
	{
		return name;
	}
	
	public String GetMyArray()
	{
		int[] a = new int[10];
		return Arrays.toString(a);
	}
	
	public static int AddVar(int a, int b)
	{
		int sum = 0;
		for(; a <= b; a++)
		{
			sum += a;
		}
		return sum;
	}

	public int GetMul()
	{
		return a * b;
	}
	
	public int SortDiff()
	{
		return a * b / c;
	}
	
	private int AddSumVar(int a , int b)
	{
		return a+b;
	}
	
	public int GetMaxValue(int a, int b)
	{
		return Math.max(a, b);
	}
	
	public int GetMaxValue(int a, int b, int c)
	{
		if(a > b) return a;
		return b;
	}
	
	public int GetMaxInArray(int [] arr)
	{
		int max = Integer.MIN_VALUE;
		System.out.println(max);
		for(int i = 0; i < arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}

}
