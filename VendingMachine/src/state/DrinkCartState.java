package state;

import java.util.Scanner;

import menus.PrintDrinkMenu;
import menus.DrinkMenu;

public class DrinkCartState implements State {
	Machine machine;
	public DrinkCartState(Machine machine) {
		this.machine =  machine;
	}
	@Override
	public void status() {
		Scanner input = new Scanner(System.in);

		System.out.println("\n************** Smart Vending Machine ***************\n");
		DrinkMenu drinkMenu = new DrinkMenu();
		PrintDrinkMenu printDrinkMenu = new PrintDrinkMenu(drinkMenu);
		printDrinkMenu.printItem();

		System.out.println("\n\nSelect one of the options item to add to cart.\n");
		int drinkChoice = input.nextInt();



		machine.cart.addItem(drinkMenu.getDrink(drinkChoice-1));

		System.out.println("\nthe drink" + drinkMenu.getDrink(drinkChoice));
		System.out.println("Item added successfully\n");
		
		System.out.println("\nWhat you do like to do next?\n"
				+ "1) View cart\n"
				+ "2) Go Back\n"
				+ "3) Main menu"

				+ "4) log out\n");
		drinkChoice = input.nextInt();
		switch(drinkChoice) {
			case 1:
				machine.setState(machine.getCheckOutState());
				machine.status();
				break;
			case 2:
				machine.setState(machine.getDrinkCartState());
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
