package com.bridgelabz.workshop;

public class GamblingSimulator {

	public static void main(String[] args) {
		int stake = 100;
		int BET = 1;
		final int WIN = 1;
		final int LOSE = 0;
		
		int dice = (int) (Math.random() * 10) % 2;
		switch (dice) {
		case WIN:
			System.out.println(" --player won the bet-- ");
			break;

		case LOSE:
			System.out.println(" --player lost the bet-- ");
			break;
		}

	}

}
