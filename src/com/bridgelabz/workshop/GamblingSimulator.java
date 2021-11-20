package com.bridgelabz.workshop;

public class GamblingSimulator {

	public static void main(String[] args) {
		int stake = 100; // initial total amount gambler has with him every day
		final int BET = 1; // amount per bet
		final int WIN = 1;
		final int LOSE = 0;
		int max_Stake = stake + stake / 2; // amount limit after 50% gain
		int min_Stake = stake - stake / 2; // amount limit after 50% loss
		System.out.println("---welcome to Gambling Simulator Program---\n");
		System.out.println(" your initial stack amount to start betting every day: 100$\n Every game bet: 1$\n");
		for (int days = 1; days <= 20; days++) {
			stake = 100;
			while (stake > min_Stake && stake < max_Stake) { // betting until he reaches maximum or minimum stake amount

				int dice = (int) (Math.random() * 10) % 2; // using random to decide win or lose
				switch (dice) {
				case WIN: // if player win the game
					stake += BET;
					break;

				case LOSE: // if player lose the game
					stake -= BET;
					break;
				}
			}
			if(stake==max_Stake) {
				System.out.println("--player won the day "+days +" bet--" );
			}
			else {
				System.out.println("--player lost the day " +days +" bet--");
			}
			System.out.println("final stake amount at day "+days+" : " + stake + "$\n");
		}

	}

}
