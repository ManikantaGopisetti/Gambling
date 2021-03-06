package com.bridgelabz.workshop;

public class GamblingSimulator {

	public static void main(String[] args) {

		System.out.println("---welcome to Gambling Simulator Program---\n");
		int stake = 100;
		int percentage = 50; // percentage limit of gain or loss

		System.out.println(" your initial stake amount to start betting every day: " + stake + "$" + "\n Every game bet: 1$\n");

		int max_Stake = stake + (int) ((percentage / (double) 100) * stake); // amount limit after 50% gain
		int min_Stake = stake - (int) ((percentage / (double) 100) * stake); // amount limit after 50% loss

		GamblingServices gambler = new GamblingServices();

		int month = 1;
		boolean win_status = true;
		while (win_status) {
			win_status = gambler.monthlyBet(stake, max_Stake, min_Stake, month);
			month++;
			if (win_status == false) {
				break;
			} else {
				continue;
			}
		}
	}
}
