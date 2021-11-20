package com.bridgelabz.workshop;

public class GamblingServices {

	static final int BET = 1; // amount per bet
	static final int WIN = 1;
	static final int LOSE = 0;
	
	
	public void monthlyBet(int stake, int max_Stake, int min_Stake,int month) {
		int win_days=0;
		int lost_days=0;
		for (int days = 1; days <= 30; days++) {
			stake = 100;
			stake=dailyBet(stake, max_Stake, min_Stake,days);
			if (stake == max_Stake) {
				System.out.println("--Player won the day " + days + " bet--");
				System.out.println("Amount won at day " + days + " : " + (stake - 100) + "$");
				win_days++;
			} else {
				System.out.println("--Player lost the day  " + days + " bet--");
				System.out.println("Amount lost at day " + days + " : " + (stake) + "$");
				lost_days++;
			}
			System.out.println("Total stake amount at day " + days + " : " + stake + "$\n");

		}
		System.out.println("No of days player won in month "+month+":"+win_days);
		System.out.println("No of days player lost in month "+month+":"+lost_days+"\n\n");
	}
		
	public int dailyBet(int stake, int max_Stake, int min_Stake, int days) {

		while (stake > min_Stake && stake < max_Stake) { // betting until he reaches maximum or minimum stake amount
			stake = eachBet(stake);
		}
		return stake;

	}

	public int eachBet(int stake) {
		int dice = (int) (Math.random() * 10) % 2; // using random to decide win or lose
		switch (dice) {
		case WIN: // if player win the game
			stake += BET;
			break;

		case LOSE: // if player lose the game
			stake -= BET;
			break;
		}
		return stake;

	}

}
