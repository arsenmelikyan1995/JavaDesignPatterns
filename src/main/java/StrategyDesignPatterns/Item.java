package StrategyDesignPatterns;

public class Item {

	private String trackingCode;
	private int price;
	
	public Item(String trackingCode, int cost){
		this.trackingCode=trackingCode;
		this.price=cost;
	}

	public String getTrackingCode() {
		return trackingCode;
	}

	public int getPrice() {
		return price;
	}
	
}