package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class OtherClassTest {

	@Test
	public void testMultiply() {
		OtherClass oc = new OtherClass();
		int x = 999;
		int y = 3;
		
		try {
			oc.multiply(6, 3);
		} catch(IllegalArgumentException e) {
			assertEquals(x * y, oc.multiply(x, y));
		}
	}
	
	@Test
	public void testMultiply_ExceptionIsThrown() {
		OtherClass oc = new OtherClass();
		try {
			oc.multiply(1000, 3);
		} catch(IllegalArgumentException e) {
			assertEquals("X should be less than 1000", e.getMessage());
		}
		
	}

}
