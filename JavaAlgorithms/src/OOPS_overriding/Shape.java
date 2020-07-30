package OOPS_overriding;

/* class Shape{
 * void draw(){
 * 	System.out.println("Drawing a shape");
 * }
 * }
 */


//abstract class Shape {
//	Shape(){
//		System.out.println("Shape constructed");
//	}
//	abstract void draw(); //no definition
//}

interface Shape{
//	Shape(){    //ERROR
//	System.out.println("Shape constructed");
//}
	void draw();
}

class Circle implements Shape{     //NO OBJECT TO OBJECT Inheritance
									//NO parent to child
	public void draw() {
		System.out.println("Drawing a circle using interface");
	}
}

//class Circle extends Shape{ //object to object inheritance
//	void draw() {  //child needs to define here
//		System.out.println("Drawing a circle"); //OverRiding 
//	}
//}

class Rectangle implements Shape{     //NO OBJECT TO OBJECT Inheritance
	//NO parent to child
	public void draw() {
		System.out.println("Drawing a retangle using interface");
	}
}

//class Rectangle extends Shape{
//	void draw() {
//		System.out.println("Drawing a Rectangle"); //Overriding
//	}
//}

