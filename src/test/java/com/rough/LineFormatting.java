package com.rough;

public class LineFormatting {
	public static void main(String[] args) {
		String list = "text here";
		list += "text there";
		list += "text everywhere";

		System.out.println("Original :\n"+list);

		list= list.replace("\n", "").replace(" ", "");
		System.out.println("New :\n"+list);

	}

}
