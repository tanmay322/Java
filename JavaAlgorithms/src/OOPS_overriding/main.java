package OOPS_overriding;

public class main {
	public static void main(String[] args) {
		Shape s;
		//s = new Shape();  //this is normal example of calling up to a class
		//s.draw();
		
		Shape t;
		
		// Polymorphic statement
		// Shape is pointing towards Circle
		// Runtime Polymorphism - same method draw over the same reference s
		
		t = new Circle();
		t.draw();
		t= new Rectangle();
		t.draw();
	}
}
