import junit.framework.TestCase;

public class TriangleTestArea extends TestCase {

	public void testCalcArea() 
	{
		//fail("Not yet implemented");
		Triangle r1= new Triangle();
		float a=r1.calcArea(4, 5);
		assertEquals((float)10,a);
	}
	public void testCalcAreanegative() 
	{
		//fail("Not yet implemented");
		Triangle r1= new Triangle();
		float a=r1.calcArea(4, 6);
		assertEquals((float)10,a);
	}
}