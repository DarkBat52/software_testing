package model;

public class Floor {
	
	public Floor(String material){
		this.material = material;
	}
	
	public void becomeFound(){
		isFound = true;
	}
	
	public void stopBeingFound() {
		isFound = false;
	}

	String material;
	boolean isFound;
	
}
