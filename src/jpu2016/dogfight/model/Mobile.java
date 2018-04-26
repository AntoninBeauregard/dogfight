package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;

public class Mobile implements IMobile{
	private int speed;
	
	public Mobile(Direction direction, Position position, Dimension dismension, int speed, String image) {

	}

	public Direction getDirection() {
		return null;
	}
	
	public void setDirection(Direction direction) {
		
	}
		
	public Position getPosition() {
		return null;
	}
	
	public Dimension getDimension() {
		return null;
	}

	public int getSpeed() {
		return 1;
	}
	
	public int getWidth() {
		return 1;
	}
	
	public int getHeight() {
		return 1;
	}

	public void move() {
		
	}

	public void placeInArea(IArea area) {
		
	}
	
	public boolean isPlayer(int player) {
		return false;
	}
	
	private void moveUp() {
		
	}
	
	private void moveRight() {
		
	}
	
	private void moveDown() {
		
	}
	
	private void moveLeft() {
		
	}
	
	public Color getColor() {
		return null;
	}
	
	public IDogfightModel getDogfightModel() {
		return null;
	}
	
	public void setDogfightModel(IDogfightModel dogfightModel) {
		
	}
	
	public boolean hit() {
		return false;
	}
	
	public boolean isWeapon() {
		return false;
	}
	
	public Image getImage() {
		return null;
	}
}

