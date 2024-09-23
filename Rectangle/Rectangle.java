public class Rectangle {
float length;
float breadth;
float Area;
float perimeter;

public float getLength() {
	return length;
}
public void setLength(float length) {
	this.length = length;
}
public float getBreadth() {
	return breadth;
}
public void setBreadth(float breadth) {
	this.breadth = breadth;
}
public float calcArea(float length,float breadth)
{
	return Area = (float) length*breadth;
}
public float calcperimeter(float length,float breadth)
{
	return perimeter = (float) 2*(length*breadth);
}
}