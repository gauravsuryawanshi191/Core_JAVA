import java.util.Scanner;
class AverageDouble{
	public static void main(String[] args){
		double d1=0,d2=0;
		Scanner sc= new Scanner(System.in);
		boolean exit=false;
		System.out.println("Enter Double Values: ");
		while(!exit){
			if(sc.hasNextDouble())
				d1=sc.nextDouble();
			else{
				System.out.println("Not a Double.");
				exit=true;
				break;
			}
			if(sc.hasNextDouble()){
				d2=sc.nextDouble();
				exit=true;
			}
			else{
				System.out.println("Not a Double.");
				exit=true;
				break;
			}
			System.out.println("Average of"+d1+" & "+d2+" is "+ ((d1+d2)/2));
		}
		sc.close();
	}
}