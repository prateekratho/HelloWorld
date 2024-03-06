package JavaPackage;

class Pen {
	String color ;
	String type; //ballpoint or gelPen

	public void write() {
		System.out.println("Writing something");
		System.out.println(color);
		System.out.println(type);
	}
	public void printColor() { //functions or methods
		System.out.println("The color of this Pen is " + this.color);
	}
}

public class oops2 {

	public static void main(String args[]) {
		Pen pen1 = new Pen();
		pen1.color = "blue";
		pen1.type = "gel";
		
		pen1.write();
	}

}
