package code;

public class Point2D {
	private double x;
	private double y;
	public Point2D(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public String getData() {
		return x+ " "+y;
	}
	public double distance(Point2D pt) {
		if(this.x==pt.x && this.y==pt.y) {
			System.out.println("Points are Equal!");
			return 0.0;
		}
		return Math.sqrt(((this.x-pt.x)*(this.x-pt.x))+((this.y-pt.y)*(this.y-pt.y)));
	}
	
}
