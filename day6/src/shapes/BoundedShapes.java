package shapes;

public abstract class BoundedShapes {
	private int x;
	private int y;

	public BoundedShapes(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "BoundedShapes [x=" + x + ", y=" + y + "]";
	}

	public abstract void area();
}
