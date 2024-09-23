/**
	 * regular
	 * @author Abhishca Tauro
	 * @param
	 * @return
	 * @since 14-09-2024
	 * @version 1.0
	 * @exception PersonNotFoundException gevonden
	 */
public class Triangle 
{
	float area;
	float b;
	float h;
	float a;
	float c;
	float perimeter;
	public float getArea() {
		/**
		 * @param area
		 * @return NA
		 */
		return area;
	}
	public void setArea(float area) {
		/**
		 * @param area
		 * @return sets the area to a variable
		 */
		this.area = area;
	}
	public float getB() {
		/**
		 * @param b as in the base of the triangle
		 * @return NA
		 */
		return b;
	}
	public void setB(float b) {
		/**
		 * @param b
		 * @return sets the value of b to the variable
		 */
		this.b = b;
	}
	public float getH() {
		/**
		 * @param h as in the height of the triangle
		 * @return NA
		 */
		return h;
	}
	public void setH(float h) {
		/**
		 * @param h
		 * @return NA
		 */
		this.h = h;
	}
	public float getA() {
		/**
		 * @param a as in the side of the triangle
		 * @return NA
		 */
		return a;
	}
	public void setA(float a) {
		/**
		 * @param a
		 * @return NA
		 */
		this.a = a;
	}
	public float getC() {
		/**
		 * @param c the other side of triangle
		 * @return return c
		 */
		return c;
	}
	public void setC(float c) {
		/**
		 * @param c
		 * @return NA
		 */
		this.c = c;
	}
	public float getPerimeter() {
		/**
		 * @param perimeter
		 * @return returns the perimeter
		 */
		return perimeter;
	}
	public void setPerimeter(float perimeter) {
		this.perimeter = perimeter;
	}
	public float calcArea(float b,float h)
	{
		return area = (float) (0.5*b*h);
	}
	public float calcperimeter(float a,float b,float c)
	{
		return perimeter = (float) (a+b+c);
	}
}