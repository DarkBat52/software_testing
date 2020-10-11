package model;

import static org.junit.Assert.*;

import java.util.ArrayDeque;
import java.util.Queue;

import org.junit.Before;
import org.junit.Test;

public class modelTest {

	Floor floor;
	Face face;
	Leg rightLeg;
	Leg leftLeg;
	Person ford;
	
	Queue<String> expressions = new ArrayDeque();
	
	//{"amazed", "surprised", "excited", "flabbergasted", "bambooseled"};
	

	@Before
	public void createFloor() {
		floor = new Floor("Wood");
	}
	

	
	@Before
	public void createPerson() {
		expressions.add("amazed");
		expressions.add("surprised");
		expressions.add("excited");
		expressions.add("flabbergasted");
		expressions.add("bamboozled");
		ford = new Person(new Face(expressions), new Leg(false, true), new Leg(false, false), "Ford");
		assertEquals("Incorrect number of expressions", expressions.size(), ford.face.numOfExpressions);
		assertEquals("right leg is left", ford.rightLeg.isLeft, false);
		assertEquals("left leg is right", ford.leftLeg.isLeft, true);
	}
	
	@Test
	public void liftAndLowerLeg() {
		ford.leftLeg.liftLeg();
		assertEquals("leg is not lifted, but should be", ford.leftLeg.isLifted, true);
		ford.leftLeg.lowerLeg();
		assertEquals("leg is lifted, but should not be", ford.leftLeg.isLifted, false);
		ford.rightLeg.liftLeg();
		assertEquals("leg is not lifted, but should be", ford.rightLeg.isLifted, true);
		ford.rightLeg.lowerLeg();
		assertEquals("leg is lifted, but should not be", ford.rightLeg.isLifted, false);
		ford.leftLeg.liftLeg();
	}
	
	@Test
	public void findFloor() {
		assertEquals( "floor is found but should not be",  floor.isFound, false);
		ford.leftLeg.findFloor(floor);
		assertEquals( "floor is not found but should be",  floor.isFound, true);
	}
	
	@Test
	public void addAndRemoveExpressions() {
		ford.face.removeExpression("amazed");
		assertEquals("did not remove expression", 4, ford.face.numOfExpressions);
		ford.face.addExpression("amazed");
		assertEquals("did not add expression", 5, ford.face.numOfExpressions);
	}

}
