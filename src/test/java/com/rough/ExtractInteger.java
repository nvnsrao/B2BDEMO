package com.rough;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractInteger {
	public static void main(String[] args) {
		String str = "Demystifying Email Design Welcome to Easy Advisor Hi santosh+20@bambu.co, Thank you for registering an account with us. To proceed with your registration, please enter the verification code below: 865040 Thank you and we look forward to you onboarding with us. Sincerely, Bambu Customer Success Team EON Shenton, 70 Shenton Way #18-08, Singapore 079118";
		final Pattern p = Pattern.compile( "(\\d{6})" );
		   final Matcher m = p.matcher( str );
		   if ( m.find() ) {
			     System.out.println(m.group( 0 ));
			 }
	}
}
