package com.bridgelabz.workshop;

public class GamblingServices {

	static final int BET = 1; // amount per bet
	static final int WIN = 1;
	static final int LOSE = 0;
	int prev_win = 0; // assigning win count where i won maximum in a day
	int prev_loss = 30; // assigning loss count where i lost maximum in a day
	int luckiest_day; // day where I won maximum
	int unluckiest_day; // day where I lost maximum

	// betting for one month
	public void monthlyBet(int stake, int max_Stake, int min_Stake, int month) {
		System.out.println("---------month " + month + " Gambling---------");
		int win_days = 0;
		int lost_days = 0;
		for (int days = 1; days <= 30; days++) {
			stake = 100;
			stake = dailyBet(stake, max_Stake, min_Stake, days);
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
		System.out.println("No of days player won in month " + month + " : " + win_days);
		System.out.println("No of days player lost in month " + month + " : " + lost_days + "\n");
		System.out.println("luckiest day in month " + month + " : " + luckiest_day);
		System.out.println("unluckiest day in month " + month + " : " + unluckiest_day + "\n\n");
	}

	// betting for 1 day
	public int dailyBet(int stake, int max_Stake, int min_Stake, int days) {
		int win_count = 0; // no of rounds win in a day
		int lost_count = 0; //// no of rounds lost in a day
		int temp = stake;

		// betting until he reaches maximum or minimum stake amount
		while (stake > min_Stake && stake < max_Stake) {
			stake = eachBet(stake);
			if (stake > temp) {
				win_count++;
			} else {
				lost_count++;
			}
		}
		if (win_count > prev_win) {
			prev_win = win_count;
			luckiest_day = days;
		}
		if (lost_count < prev_loss) {
			prev_loss = lost_count;
			unluckiest_day = days;
		}
		return stake;
	}

	// betting for one time
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
