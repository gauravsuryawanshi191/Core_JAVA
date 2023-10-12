package solveEG;

public class C implements A, B {
	public double calculator(double d1, double d2) {
		return d1 + d2;
	}

	public int calculator(int d1, int d2) {
		return d1 + d2;
	}

//	public int calculator(double d1, double d2) {
//		return (int)(d1 + d2);
//	}

	public static void main(String[] args) {
		C obj = new C();
		System.out.println(obj.calculator(2.3, 6.2));
		System.out.println(obj.calculator(2,3.3));
	}
}
