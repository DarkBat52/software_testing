package soft_testing_lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	double errorTolerance = 0.001;
	
	@Test
	public void test() {
		for (double i = -4; i <= 4.05; i = i + 0.1) {
			assTrue(i*Math.PI);
		}
	}

	void assTrue(double x) {
		assertTrue(Math.abs(Func.function(x) - Math.cos(x)) < errorTolerance);
		
	}
	
}
