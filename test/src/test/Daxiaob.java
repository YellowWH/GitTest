package test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Daxiaob {
	public static void main(String args[]) {
		String str1 = "How are you?";
		String str2 = "Howareyou";
		
		String regex1 = "o\\B";
		
		Pattern p = Pattern.compile(regex1);
		
		check(p, str2);
	}
	private static void check(Pattern p, String target)
	{
		Matcher m = p.matcher(target);
		if(m.find())
		{
			System.out.println("ok");
		}
		else {
			System.out.println("no-ok");
		}
	}
}
