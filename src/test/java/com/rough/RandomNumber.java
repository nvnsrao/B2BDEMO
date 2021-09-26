package com.rough;

import java.util.Random;

public class RandomNumber {

public static void main(String[] args) {
	int min = 100;
    int max = 999;
    //Generate random int value from 50 to 100 
    System.out.println("Random value in int from "+min+" to "+max+ ":");
    int random_int = (int)(Math.random() * (max - min + 1) + min);
    System.out.println(random_int);
}
}
