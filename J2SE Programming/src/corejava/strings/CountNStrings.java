package corejava.strings;

public class CountNStrings {

	public static void main(String[] args) {
		CountNStrings co = new CountNStrings();
		String[] s = {"cat","rat","donkey","dog","cow"};
		System.out.println(co.getNStrings(s, 3));

	}
	public int getNStrings(String[] s,int n)
	{
		int i = 0;
		int sum = 0;
		while(i<s.length)
		{
			if(n == s[i].length())
				sum = sum+1;
			i++;
		}
		return sum;
	}

}
