/*
4.Create a  class Point2D   for representing a point in x-y co-ordinate system.

4.1 Create a parameterized constructor to accept x & y co-ords.

4.2 Add  show() method  --to return point's x & y co-ords
eg : public String show() {.....}

4.3 (Optional work)
Add a non static  , isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.

How will you invoke it from the tester 
A Hint : 

eg : p1.isEqual(p2); 
OR
p2.isEqual(p1)

4.4 (Optional work)
Add a non static method , calculateDistance , to calc distance between 2 points
Hint : use distance formula.

eg : In Tester :
double distance=p1.calculateDistance(p2);

4.5  Create a driver  class(for UI )  , "TestPoint" , with main(..)

4.6  Accept x,y co-ordinates for 2 points n store the co-ordinates
4.7  Display x,y co-ordinates of both of the points plotted  (using show() method)
4.8  (Optional work)
Find out if the points  are same or different (Hint : isEqual)
Print the message accordingly. (print SAME or DIFFERENT)
If points are not same , display distance between these 2 points.
*/
 class Point2D{
		private double x;
		private double y;
		Point2D(double x,double y){
			this.x=x;
			this.y=y;
		}
		public String show(){
			return "X co-ordinate="+x+", Y co-ordinate="+y;
		}
		public boolean isEqual(Point2D obj){
			if(this.x==obj.x && this.y==obj.y)
				return true;
			return false;
		}
		public double calculateDistance(Point2D obj){
			return Math.sqrt(((this.x-obj.x)*(this.x-obj.x))+ ((this.y- obj.y)*(this.y- obj.y)));
		}
}