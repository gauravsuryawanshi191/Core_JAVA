import java.util.Scanner;


class TestPoint{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean exit=false;
		System.out.println("Enter Co-ordinates for Point1:");
		Point2D p1=new Point2D(sc.nextDouble(),sc.nextDouble());
		System.out.println("Enter Co-ordinates for Point2:");
		Point2D p2=new Point2D(sc.nextDouble(),sc.nextDouble());
		System.out.println("===========================================================================================");
		System.out.println("1.Show Co-ordinates\n2.Check Equality of Points\n3.Calculate Distance between Points\n4.Exit!");
		while(!exit){
			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.print("Enter Choice: ");
			switch (sc.nextInt()){
				case 1: 
					System.out.println("Point1: "+p1.show());
					System.out.println("Point2: "+p2.show());
					break;
				case 2:
					System.out.println("P1 & P2 are Equal: "+p1.isEqual(p2));
					break;
				case 3: 
					System.out.println("Distance between Points is "+p1.calculateDistance(p2));
					break;
				case 4:
					System.out.println("Terminating Application...");
					exit=true;
					System.out.print("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
					break;
			}
		}
		p1=p2=null;
		sc.close();
	}
}