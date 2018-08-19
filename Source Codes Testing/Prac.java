import java.util.*;
class point {
	double x,y;
	void dis(double a,double b)
	{
		double ans=Math.sqrt(Math.pow((a-x), 2) + Math.pow((b-y), 2));
		System.out.println(ans);

	}
	void set()
	{
        x = 1;
		y = 1;
	}
}
public class Prac {
	public static void main(String[] args) 
	{
		point p1 = new point();
		point p2 = new point();
		p1.set();
		Scanner as = new Scanner(System.in);
		System.out.println("enter the co ordinates of second point");
		p2.x = as.nextDouble();
		p2.y = as.nextDouble();
		p1.dis(p2.x,p2.y);
		as.close();
	}
}
