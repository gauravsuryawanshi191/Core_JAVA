import java.util.Scanner;
class Division{
	public static void main(String[] args){
		System.out.print("Enter 2 Numbers: ");
		Scanner sc= new Scanner(System.in);
		double d1= sc.nextDouble();
		double d2= sc.nextDouble();
		System.out.print("Division of"+ d1+" & "+d2+" is "+ (d1/d2));
	}
}