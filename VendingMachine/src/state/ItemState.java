package state;

import java.util.Scanner;

public class ItemState implements State{

	Machine machine;
	public ItemState(Machine machine) {
		this.machine =  machine;
	}
	@Override
	public void status() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n************** Smart Vending Machine ***************\n"+
		"Select one of the options.\n"+
		"1) View Drinks\n"+
		"2) View Snacks\n"+
		"3) Log Out\n");

		int userInput = input.nextInt();

	}

}
