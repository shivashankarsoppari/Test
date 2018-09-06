package corejava.strings;

public class TestString {

	public static void main(String[] args) {
		TestString to = new TestString();
		to.getString("Coward", 4);
		to.getString("Coward", 2);
		to.getString("Coward", 1);
		

	}
	public void getString(String s,int n)
	{
		int i = 1;
		if(n>=3)
		{
			String s1 = s.substring(0, 3);
			while(i<=n)
			{
				System.out.print(s1 + " ");
				i++;
			}
		}
		else
		{
			String s1 = s.substring(0, n);
			while(i<=n)
			{
				System.out.print(s1 + " ");
				i++;
			}
		}
		System.out.println();
	}

}
