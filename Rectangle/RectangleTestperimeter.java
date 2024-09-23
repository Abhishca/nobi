import junit.framework.TestCase;

public class RectangleTestperimeter extends TestCase {

	public void testCalcperimeter() {
		//fail("Not yet implemented");
		Rectangle r2 = new Rectangle();
		float p = r2.calcperimeter(4, 5);
		assertEquals((float)40,p);
	}

}
