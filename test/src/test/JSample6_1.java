package test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class JSample6_1 {
	  public static void main(String args[]){
		    String str1 = "Tomato is 100yen, Lemon is 80yen, Banana is 140yen.";
		    String str2 = "abcdefghij";
		    
		    String regex1 = "\\d.+?yen";
		    String regex2 = "^abc";
		    String regex3 = "hij$";
		    String regex4 = "\\,.*?i";
		    
		    Pattern p1 = Pattern.compile(regex1);
		    Pattern p2 = Pattern.compile(regex2);
		    Pattern p3 = Pattern.compile(regex3);
		    Pattern p4 = Pattern.compile(regex4);
		    
		    System.out.println("Target :"+str1);
		    System.out.println("Pattern :"+regex1+"\n");
		    
		    check(p1,str1);
		    check(p2,str2);
		    check(p3,str2);
		    check(p4,str1);
	  }
	  private static void check(Pattern p,String target) {
		  Matcher m = p.matcher(target);
		  while(m.find()) {
			  System.out.println("match :"+m.group());
		  }
	  }
}
