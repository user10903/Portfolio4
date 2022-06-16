package Square;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SquareTest {
	
	
	@Test
	public void testLength() {
		Square r = new Square(5,5);	
		assertEquals(5,r.getLength());
	}
	
	@Test
	public void testWidth() {
		Square r = new Square(5,5);	
		assertEquals(5,r.getWidth());
	}
	
	@Test
	public void testArea() {
		Square r = new Square(5,5);
		assertEquals(25,r.getArea());
	}
	

}
