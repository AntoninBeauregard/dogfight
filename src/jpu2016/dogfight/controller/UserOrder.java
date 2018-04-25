package jpu2016.dogfight.controller;

public class UserOrder {
	private int player;
	
	public UserOrder(int player, Order order) {
		
	}
	
	public Order getOrder() {
		return Order.NOP;
	}
	
	public int getPlayer() {
		return 1;
	}
}
