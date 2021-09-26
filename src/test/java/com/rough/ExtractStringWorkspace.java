package com.rough;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractStringWorkspace {
	public static void main(String[] args) {
		String str = "Hello santosh+201@bambu.co,Thank you for your patience. Your workspace is:ambutestf733 You may log in to your account by clicking here.Sincerely,Bambu Customer Success TeamEON Shenton, 70 Shenton Way #18-08, Singapore 079118";
		
		String regex = "\\bambutest[a-zA-Z0-9]*";
		/*Pattern p = Pattern.compile(regex, Pattern.MULTILINE);

		Matcher m = p.matcher(str);
		while (m.find()) {
		    String outputThis = m.group(0);
		    System.out.println(outputThis);
		}*/
		
		final Pattern p = Pattern.compile(regex);
		   final Matcher m = p.matcher(str);
		   if ( m.find() ) {
			     System.out.println(m.group(0));
			 }
		
	}
}
