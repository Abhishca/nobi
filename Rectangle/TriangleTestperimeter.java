import junit.framework.TestCase;

public class TriangleTestperimeter extends TestCase {

	public void testCalcperimeter() {
		//fail("Not yet implemented");
		Triangle r2 = new Triangle();
		float t = r2.calcperimeter(4, 5, 4);
		assertEquals((float)13,t);
	}
	public void testCalcperimeternegavtive() {
		//fail("Not yet implemented");
		Triangle r2 = new Triangle();
		float t = r2.calcperimeter(4, 5, 9);
		assertEquals((float)13,t);
	}

}
