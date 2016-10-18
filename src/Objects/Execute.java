package Objects;

import java.util.Arrays;
import java.util.HashMap;

public class Execute {
	public static void main(String[] args) {
		IAnimal Eric = new Human(true, true, true, false);
		IAnimal bug = new Bug(true, false, true, true);
		Eric.SetName("Eric");
		Eric.ToggleWings();
		System.out.println(Eric.HasWings());
		IAnimal Ayo = new Human(false, true, true, true);
		Ayo.SetName("Ayomitunde");
		System.out.println(Eric.GetName() + " is coding with " + Ayo.GetName());

		Rectangle r = new Rectangle(4,40);
		System.out.println(r.width);
		System.out.println(r.height);
		
		System.out.println(r.getArea());
		System.out.println(r.getPerimeter());
		
		Rectangle s = new Rectangle();
		System.out.println(s.width);
		System.out.println(s.height);
		
		System.out.println(s.getArea());
		System.out.println(s.getPerimeter());
		System.out.println(count("Welcome",'e'));
		char[] randChar = CreateArray();
		System.out.println(Arrays.toString(randChar));
		System.out.println(CountOccurence(randChar));
		

	}
	
	public static char GetRandomChar(char ch1, char ch2)
	{
		return (char) (ch1+Math.random() * (ch2 - ch1 + 1));
	}
	public static char GetRandomLowerCase()
	{
		return GetRandomChar('a', 'z');
	}
	
	public static char[] CreateArray()
	{
		char [] chars= new char[100000];
		for(int i = 0; i < chars.length; i++)
		{
			chars[i] = GetRandomLowerCase();
		}
		return chars;
	}
	
	public static int count (String str, char a){
		int numOfOccurrence = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i)== a){
				numOfOccurrence++;
			}
		}
		return numOfOccurrence;
	}
	
	public static HashMap<Character, Integer> CountOccurence(char[] words)
	{
		HashMap<Character, Integer> counter = new HashMap<>();
		for(char c : words)
		{
			//System.out.println("looking at "+c);
			if(counter.containsKey(c))
			{
				counter.put(c, counter.get(c) + 1);
			}else
			{
				counter.put(c, 1);
			}
		}
		return counter;
	}
}
