package StrategyDesignPatterns;

import StrategyDesignPatterns.stratrgy.types.CreditCardStrategy;
import StrategyDesignPatterns.stratrgy.types.PaypalStrategy;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",20);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("valodik@example.com", "mypwd"));
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("Valod Valodik", "12345678987654321", "777", "13/15"));
	}

}