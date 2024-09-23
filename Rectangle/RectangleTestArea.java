import junit.framework.TestCase;

public class RectangleTestArea extends TestCase {

	public void testCalcArea() {
		//fail("Not yet implemented");
		Rectangle r1= new Rectangle();
		float a=r1.calcArea(4, 5);
		assertEquals((float)20,a);
	}

}
