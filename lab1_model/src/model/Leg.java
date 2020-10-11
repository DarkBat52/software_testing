package model;

public class Leg {

	boolean isLifted;
	Floor floor;
	
	Leg(boolean isLifted, boolean isLeft){
		this.isLifted = isLifted;
		this.isLeft = isLeft;
	}
	
	public void liftLeg() {
		isLifted = true;
	}
	
	public void lowerLeg() {
		isLifted = false;
	}
	
	public void findFloor(Floor floor) {
		this.floor = floor;
		floor.becomeFound();
	}
	
	boolean isLeft;
	
}
