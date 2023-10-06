/*
Accept 2 numbers from user & operation to perform
1. Add 2.Subtract 3. Multiply 4.Divide 5.Exit
Display the result of the operation. 
Java app must continue to run till user chooses exit option.
*/
import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		System.out.print("==============================================================================");
		System.out.print("Enter 2 Numbers: ");
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		boolean exit=false;
		while(!exit){
			System.out.println("===========================================================================");
			System.out.println("1.Add  2.Substract  3.Multiply  4.Divide  5.Exit");
			System.out.println("Enter Choice: ");
			switch (sc.nextInt()){
				case 1:
					System.out.println("Addition: "+n1+"+"+n2+"="+(n1+n2));
					break;
				case 2:
					System.out.println("Substraction: "+n1+"-"+n2+"="+(n1-n2));
					break;
				case 3:
					System.out.println("Multiplication: "+n1+"*"+n2+"="+(n1*n2));
					break;
				case 4:
					System.out.println("Division: "+n1+"/"+n2+"="+(n1/n2));
					break;
				case 5:
					System.out.println("Terminating Application...");
					exit=true;
					System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
					break;
				default:
					System.out.println("Enter Valid Choice!");
			}
		}
	}
}