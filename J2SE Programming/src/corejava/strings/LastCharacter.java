package corejava.strings;

public class LastCharacter {

	public static void main(String[] args) {
		String s[] = {"abc","dce","fgh"};
		LastCharacter lco = new LastCharacter();
		System.out.println(lco.getLastChar(s));

	}
	public String getLastChar(String[] s)
	{
		int i = 0;
		StringBuffer sb = new StringBuffer();
		while(i<s.length)
		{
			
			char ch[] = s[i].toCharArray();
			int l = ch.length;
			
			sb.append(ch[l-1]);
			
			i++;
		}
		return sb.toString();
	}

}
