package com.coreofjava.labs;

public class StringOPeration {
	private String strVar;

	public String getStrVar() {
		return strVar;
	}

	public void setStrVar(String strVar) {
		this.strVar = strVar;
	}
	public String getReverse()
	{
		StringBuffer  sb = new StringBuffer(strVar);
		sb.reverse();
		return sb.toString();
	}
	public String stringReverse()
	{
		char ch[] = new char[strVar.length()];
		int j = 0;
		for(int i = strVar.length()-1;i>=0;i--)
		{
			ch[j] = strVar.charAt(i);
		}
		//
		strVar = new String(ch);
		return strVar;
	}
}
