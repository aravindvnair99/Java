import java.util.*;

class point {
	double x, y;

	void dis(double a, double b) {
		double ans = Math.sqrt(Math.pow((a - x), 2) + Math.pow((b - y), 2));
		System.out.println(ans);
	}

	void set() {
		x = 0;
		y = 0;
	}
}

public class DistanceFromOrigin {
	public static void main(String[] args) {
		point p1 = new point();
		point p2 = new point();
		p1.set();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co ordinates of second point");
		p2.x = sc.nextDouble();
		p2.y = sc.nextDouble();
		p1.dis(p2.x, p2.y);
		sc.close();
	}
}