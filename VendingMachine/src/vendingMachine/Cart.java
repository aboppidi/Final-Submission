package vendingMachine;
import factory.*;
import java.util.*;
public class Cart {
	List<Item> items;
	public Cart() {
		items = new ArrayList<Item>();
	}
	public void addItem(Item item) {
		this.items.add(item);
	}
	public void removeItem(int position) {
		this.items.remove(position);
	}
	public void printCart() {
		double total = 0;
		for(Item item :  items) {
			total += item.getCost();
			System.out.println(item.getName() + " cost " + item.getCost());
		}
		System.out.println("Total cost is " + Math.ceil(total));
	}
	public void empty() {
		items.clear();
	}

	public int getNumOfItemsInCart(){
		return this.items.size();
	}

	public double getTotalPriceOfCart(){
		return this.items.stream().map(x -> x.getCost()).reduce(0.0, (a, b) -> a+b);
	}
}
