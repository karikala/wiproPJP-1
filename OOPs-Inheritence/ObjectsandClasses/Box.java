/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. 
The class should have a method that can return the volume of the box. 
Create an object of the Box class and test the functionalities.
*/

class Box{
 	int width, height, depth;

	Box(int width1, int height1, int depth1){
		width = width1;
		height = height1;
		depth = depth1;

		System.out.println("In the Constructor");
		System.out.println(width+" "+ height+" "+depth);
		System.out.println(width1+" "+ height1+" "+depth1);

	}

	int volumeOfTheBox(){
		System.out.println("In the volume method: ");
		System.out.println(width+" "+height+" "+depth);

		return width*height*depth;
	}

	public String toString(){

		return String.valueOf(width);

	}

	public static void main(String[] args) {
		Box B1 = new Box(3,5,6);
		System.out.println(B1);

		Box B2 = new Box(4,4,4);
		System.out.println(B2);
		
		System.out.println("The are of the box is: " + B1.volumeOfTheBox());
		
		System.out.println("The are of the box is: " + B2.volumeOfTheBox());
		


	}
}