package mx.tec.lab;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnderstandingAssertsApplicationTests {

	@Test
	public void whenAssertingEquality_thenEqual() {
		String expected = "Winter is coming";
		String actual = "Winter is coming";
		
		//assertEquals(expected, actual);
		
		assertEquals(expected, actual, "failure - strings are not equal");

	}
	
	@Test
	public void whenAssertingArraysEquality_thenEqual() {
		char[] expected = {'J','u','n','i','t'};
		char[] actual = "Junit".toCharArray();
		
		assertArrayEquals(expected, actual);
	}
	
	
	@Test
	public void givenNullArrays_whenAssertingArraysEquality_thenEqual() {
		int[] expected = null;
		int[] actual = null;
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void whenAssertingNull_thenTrue() {
		Object longclaw = null;
		
		assertNull(longclaw, "The longclaw should be null");
	}
	
	@Test
	public void whenAssertingNull_thenFalse() {
		Object longclaw = 1;
		
		assertNotNull(longclaw, "The longclaw should be null");
	}
	
	@Test
	public void whenAssertingNotSameObject_thenDifferent() {
		Object oathkeeper = new Object();
		Object widowswall = new Object();
		
		assertNotSame(oathkeeper, widowswall);
	}
	
	@Test
	public void whenAssertingSameObject_thenSame() {
		Object widowswall = new Object();
		
		assertSame(widowswall, widowswall);
	}
	
	@Test
	public void whenAssertingConditions_thenVerified() {
		assertTrue(5 > 4, "5 is greater then 4");
		assertFalse(5 > 6, "5 is not greater then 6");
	}
	
	@Test
	public void whenCheckingExceptionMessage_thenEqual() {
		AnyClass ac = new AnyClass();
		
		try {
			ac.methodThatShouldThrowException();
			
		} catch(UnsupportedOperationException e) {
			assertEquals("Operation Not Supported", e.getMessage());
		}
	}
	
	@Test
	public void testAssertThatHasItems() {
		assertThat(Arrays.asList("Winterfell")).contains("Winterfell");	}
}
