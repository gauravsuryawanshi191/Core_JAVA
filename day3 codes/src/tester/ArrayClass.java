package tester;
import java.util.Scanner;
class ArrayClass{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter No of Elements in Array: ");
		double[] doubleArray= new double[sc.nextInt()];
		System.out.println("Enter Elements of Array:");
		for(int i=0;i<doubleArray.length;i++){
			doubleArray[i]=sc.nextDouble();
		}
		System.out.println("Displaying Elements of Array:");
		for(int i=0;i<doubleArray.length;i++){
			System.out.print(doubleArray[i]+" | ");
		}
	}
}