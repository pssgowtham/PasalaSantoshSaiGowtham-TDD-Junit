package com.epam.tdd_junit;

public class Baka {
	public String fun(String a) {
		if(a=="")
			return a;
		else if(a=="A"||a=="AA")
			return "";
		char x=a.charAt(0);
		char y=a.charAt(1);
		if(x=='A'&&y=='A') {
			return a.substring(2,a.length());
		}
		else if(x=='A') {
			return a.substring(1,a.length());
		}
		else if(y=='A') {
			return x+a.substring(2,a.length());
		}
		return a;
	}
}
