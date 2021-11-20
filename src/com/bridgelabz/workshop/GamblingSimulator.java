package com.bridgelabz.workshop;

public class GamblingSimulator {

	public static void main(String[] args) {
		int stake = 100;	 // initial total amount gambler has with him
		final int BET = 1;   // amount per bet
		final int WIN = 1;	
		final int LOSE = 0;
		int max_Stake = stake + stake / 2;  //amount limit after 50% gain
		int min_Stake = stake - stake / 2;	//amount limit after 50% loss
		System.out.println("---welcome to Gambling Simulator Program---");
		//int round=1;
		
		while (stake > min_Stake && stake < max_Stake) {	//betting until he reaches maximum or minimum stake amount
			
			int dice = (int) (Math.random() * 10) % 2; // using random to decide win or lose
			switch (dice) {
			case WIN: // if player win the game
				System.out.println(" --player won the bet-- ");
				stake += BET;
				//System.out.println(" Balance amount after round "+round+" : "+stake+"$");   //printing balance with round number
				break;

			case LOSE: // if player lose the game
				System.out.println(" --player lost the bet-- ");
				stake -= BET;
				//System.out.println(" Balance amount after round "+round+" : "+stake+"$");	 //printing balance with round number
				break;
			}
			//round++;
		}
		System.out.println("player reached the limit");
		System.out.println("final stake amount = " + stake + "$");

	}

}
