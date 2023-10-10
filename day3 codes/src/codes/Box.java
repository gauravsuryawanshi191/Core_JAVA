package codes;
public class Box{
	private double width;
	private double height;
	private double breadth;
	public Box(double width,double height,double breadth){
		this.width=width;
		this.height=height;
		this.breadth=breadth;
	}
	public Box(double side){
		this(side,side,side);
	}
	public Box(){
		this(0);
	}
	public void displayBox(){
		System.out.println("Dimensions are: "+width+" | "+height+" | "+breadth);
	}
	public boolean isEqual(Box obj){
		return this.width==obj.width && this.height==obj.height && this.breadth==obj.breadth;
	}
	
	public Box createNewBox(double width,double height,double breadth){
		Box newBox = new Box(this.width+width,this.height+height,this.breadth+breadth);
		return newBox;
	}
}