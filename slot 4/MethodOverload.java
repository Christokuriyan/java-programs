import java.io.*;

class Rectangle {

	void Area(double S, double T)
	{
		System.out.println("Area of the rectangle: "
						+ S * T);
	}

	void Area(int S, int T)
	{
		System.out.println("Area of the rectangle: "
						+ S * T);
	}
	void Perimeter(int l, int b)
	{
		System.out.println("Perimeter of the rectangle: "
						+  2*(l+b));
	}
	void Perimeter(float l, float b)
	{
		System.out.println("Perimeter of the rectangle: "
						+  2*(l+b));
	}
}

class MethodOverload {

	public static void main(String[] args)
	{

		Rectangle obj = new Rectangle();

	
		obj.Area(20, 10);
		obj.Area(10.5, 5.5);
		obj.Perimeter(20,10);
		obj.Perimeter(10.5f, 5.5f);
	}
}
