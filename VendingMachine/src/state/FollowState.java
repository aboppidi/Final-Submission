package state;

import java.util.Scanner;

public class FollowState implements State {

	Machine machine;
	public FollowState(Machine machine) {
		this.machine =  machine;
	}
	@Override
	public void status() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n\n************** Smart Vending Machine ***************\n"+
		"Select one of the options.\n"+
		"1) Order again\n"+
		"2) Log out\n");

		int userInput = input.nextInt();

		switch(userInput) {
		case 1:

			machine.setState(machine.getMainState());
			machine.status();
			break;
		default:
			System.exit(0);
		}
	}

}
