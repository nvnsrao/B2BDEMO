package com.bambu.app.utils;

import java.util.Random;

public class PortfolioType {
		public enum RandomPortfolioList{
		VeryConservative,
		VeryVeryConservative,
		Moderate,
		VeryModerate,
		VeryVeryModerate,
		Aggressive,
		VeryAggressive,
		VeryVeryAggressive,
		Normal,
		VeryNormal,
		VeryVeryNormal,
		Simple,
		VerySimple,
		VeryVerySimple;
	}
		public static RandomPortfolioList getRandomPortfolio(){
			RandomPortfolioList[] randomPortfolio = RandomPortfolioList.values();
			Random generator = new Random();
			return randomPortfolio[generator.nextInt(randomPortfolio.length)];
		}
}
