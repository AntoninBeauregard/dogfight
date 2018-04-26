package jpu2016.dogfight.model;

import java.awt.Image;

public interface IMobile {
	Direction getDirection();
	void setDirection(Direction direction);
	Position getPosition();
	Dimension getDimension();
	int getWidth();
	int getHeight();
	int getSpeed();
	Image getImage();
	void move();
	void placeInArea(IArea area);
	boolean isPlayer(int player);
	void setDogfightModel(IDogfightModel dogfightModel);
	boolean hit();
	boolean isWeapon();
}
