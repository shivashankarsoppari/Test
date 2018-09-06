package com.coreofjava.labs;

public class ReverseByWord {
	private String revStr;

	public String getRevStr() {
		return revStr;
	}

	public void setRevStr(String revStr) {
		this.revStr = revStr;
	}
	public String reverseByWord()
	{
		StringBuffer so = new StringBuffer();//original
		StringBuffer sb = new StringBuffer();//only word
		//int k = -1;
		int l = revStr.length()-1;
		while(l >= 0)
		{
			if(revStr.charAt(l) == ' ')
			{
				sb.reverse();
				so.append(sb + " ");
				sb.delete(0, sb.length());
				l--;
				continue;
			}
			sb.append(revStr.charAt(l));
			l--;
		}
		sb.reverse();
		so.append(sb);
		return so.toString();
	}
	
}
