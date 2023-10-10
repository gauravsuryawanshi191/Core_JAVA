package tester;
import codes.Box;
import java.util.Scanner;
class TestBox{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Box b0= new Box();
		System.out.println("Enter Dimensions of Box1: ");
		Box b1= new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("Enter Dimensions for Cube: ");
		Box cube= new Box(sc.nextDouble());
		b0.displayBox();
		b1.displayBox();
		cube.displayBox();
		System.out.println("Create Box From Box1:");
		System.out.println("Enter Offset Changes: ");
		Box b2= b1.createNewBox(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		b2.displayBox();
		sc.close();
	}
}