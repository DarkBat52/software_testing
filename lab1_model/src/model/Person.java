package model;

public class Person {
	
	Face face;
	Leg leftLeg;
	Leg rightLeg;
	String name;
	
	Person(Face face, Leg leftLeg, Leg rightLeg, String name){
		this.face = face;
		this.leftLeg = leftLeg;
		this.rightLeg = rightLeg;
		this.name = name;
	}
	
	
}

