package test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class daxiaoz {
	public static void main(String args[]){
		String str1 = "abc def";
		String str2 = "def abc";
		String str3 = "abc\ndef";
		String str4 = "def abc\n";
		
		String regex1 = "abc\\Z";
		String regex2 = "abc\\z";
		
		Pattern p1 = Pattern.compile(regex1);
		Pattern p2 = Pattern.compile(regex2);
		
		System.out.println("pattern is " + regex1);
		
		check1(p1,str1);
		check1(p1,str2);
		check1(p1,str3);
		check1(p1,str4);
		
		System.out.println("pattern is " + regex2);
		
		check1(p2,str1);
		check1(p2,str2);
		check1(p2,str3);
		check1(p2,str4);
	}
	
	private static void check1(Pattern p, String target)
	{
		Matcher m = p.matcher(target);
		if(m.find())
		{
			System.out.println("ÅZ" + target);
		}else
		{
			System.out.println("Å~" + target);
		}

	}
}
