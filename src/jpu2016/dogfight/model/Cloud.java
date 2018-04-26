package jpu2016.dogfight.model;

public class Cloud extends Mobile{

	private static int SPEEED = 1;
	private static int WIDTH = 300;
	private static int HEIGHT = 150;
	private static String IMAGE = "cloud";

	public Cloud(Direction direction, Position position, Dimension dismension, int speed, String image) {
		super(direction, position, dismension, speed, image);
		// TODO Auto-generated constructor stub
	}
}
