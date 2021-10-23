package state;

import java.util.Scanner;

import menus.DrinkMenu;
import menus.PrintDrinkMenu;
import menus.PrintSnackMenu;
import menus.SnackMenu;

public class SnackCartState implements State{
	Machine machine;
	public SnackCartState(Machine machine) {
		this.machine =  machine;
	}
	@Override
	public void status() {
		Scanner input = new Scanner(System.in);



		System.out.println("\n************** Smart Vending Machine ***************\n");
		SnackMenu snackMenu = new SnackMenu();
		PrintSnackMenu printSnackMenu = new PrintSnackMenu(snackMenu);
		printSnackMenu.printItem();

		System.out.println("\n\nSelect one of the options item to add to cart.\n");
		int snackChoice = input.nextInt();



		machine.cart.addItem(snackMenu.getSnack(snackChoice-1));

		System.out.println("\nthe snack" + snackMenu.getSnack(snackChoice));
		System.out.println("Item added successfully\n");

		System.out.println("\nWhat you do like to do next?\n"
				+ "1) View cart\n"
				+ "2) Go Back\n"
				+ "3) Main menu\n"
				+ "4) log out\n");
		snackChoice = input.nextInt();
		switch(snackChoice) {
			case 1:
				machine.setState(machine.getCheckOutState());
				machine.status();
				break;
			case 2:
				machine.setState(machine.getSnackCartState());
				machine.status();
				break;
			case 3:
				machine.setState(machine.getMainState());
				machine.status();
				break;
			default:
				System.exit(0);
			}


		}



}
