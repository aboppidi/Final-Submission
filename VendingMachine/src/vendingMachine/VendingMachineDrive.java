package vendingMachine;
import state.*;
public class VendingMachineDrive {

	public static void main(String[] args) {
		Machine machine = new Machine();
		MenuState state = new MenuState(machine);
		state.status();
	}

}
