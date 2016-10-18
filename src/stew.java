import java.util.Arrays;

public class stew {

	public static void main(String[] args) {

		Methods mth = new Methods();
		Methods passMth = new Methods(2);
		System.out.println(Methods.AddVar(10, 20));
		System.out.println(mth.GetMul());
		System.out.println(passMth.SortDiff());
		int a = 20;
		int eric = -20;
		System.out.println(mth.GetMaxValue(20, eric));
		int [] arr = new int [10];
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random() * 10 );
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(mth.GetMaxInArray(arr));
		System.out.println(mth.maxValue);
		System.out.println(mth.GetName());
		System.out.println(mth.GetMyArray());
	}

}
