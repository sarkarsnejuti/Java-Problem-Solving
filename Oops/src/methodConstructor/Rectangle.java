package methodConstructor;

public class Rectangle {
int length;
int width;

Rectangle (int length,int width){
	this.length = length;
	this.width = width;
}

int calculateArea()
{
	int area = (length*width);
	return area;
	//System.out.println("Area is " + (length*width));
}
public void calculatePerimeter() {
	int perimeter = ((length + width)*2);
	System.out.println("Perimeter is " + perimeter);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle re  = new Rectangle(10,5);
		System.out.println("Area is " + re.calculateArea());
		re.calculatePerimeter();

	}


}