package state;
import vendingMachine.Cart;
public class Machine {
	State mainState;
	State categoryState;
	State itemState;
	State cartState;
	State checkOutState;
	State followState;
	State drinkCartState;
	State snackCartState;
	State state;
	Cart cart;
	public Machine() {
		mainState = new MenuState(this);
		categoryState = new CategoryState(this);
		itemState = new ItemState(this);
		cartState = new SnackCartState(this);
		checkOutState = new CheckoutState(this);
		followState = new FollowState(this);
		drinkCartState = new DrinkCartState(this);
		snackCartState = new SnackCartState(this);
		cart = new Cart();
		state = mainState;
		}
	public State getState() {
		return state;
	}

	public State getDrinkCartState() {
		return drinkCartState;
	}

	public State getSnackCartState() {
		return snackCartState;
	}

	public void setState(State state) {
		this.state = state;
	}
	public State getMainState() {
		return mainState;
	}

	public State getCategoryState() {
		return categoryState;
	}

	public State getItemState() {
		return itemState;
	}

	public State getCartState() {
		return cartState;
	}

	public State getCheckOutState() {
		return checkOutState;
	}

	public State getFollowState() {
		return followState;
	}

	public void status() {
		state.status();
	}

}
