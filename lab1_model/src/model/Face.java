package model;

import java.util.Queue;

public class Face {
	
	Queue<String> faceExpressionPorridge;
	int numOfExpressions;
	
	Face(Queue<String> faceExpressionPorridge){
		this.faceExpressionPorridge = faceExpressionPorridge;
		numOfExpressions = faceExpressionPorridge.size();
	}
	
	public void removeExpression(String expression) {
		faceExpressionPorridge.remove(expression);
		numOfExpressions--;
	}
	
	public void addExpression(String expression) {
		faceExpressionPorridge.add(expression);
		numOfExpressions++;
	}
	
}
