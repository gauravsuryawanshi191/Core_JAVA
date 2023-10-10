package tester;
import java.util.Scanner;

import code.Point2D;
import tester.TestPoints;

public class TestPoints {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter No of Points to be Plotted: ");
		Point2D[] ptArray= new Point2D[sc.nextInt()];
		System.out.println("1.Plot a Point\n2.Display all points Plotted\n3.Distance\n4.Exit");
		boolean exit= true;
		int count=0;
		while(exit) {
			System.out.print("Enter Choice: ");
			switch (sc.nextInt()) {
				case 1:
					if(count<=ptArray.length-1) {
						ptArray[count]= new Point2D(sc.nextDouble(), sc.nextDouble());
						count++;
					}
					else
						System.out.println("Points limit reached");
					break;
				case 2:
					for(Point2D p : ptArray) {
						System.out.println(p.getData());
					}
					break;
				case 3:
					System.out.println("Enter Point1 and Point2 index:");
					System.out.println(ptArray[sc.nextInt()].distance(ptArray[sc.nextInt()]));
					
					break;
				case 4:
					System.out.println("Terminating Application!");
					exit=false;
					break;
				default:
					break;
			}
		}
		sc.close();
	}

}
