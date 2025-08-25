import java.util.Scanner;

public class VelocityDistance{
	public static void main(String[] args){

		float u,a,t;
		double v,s;
		Scanner sc = new Scanner(System.in);

		System.out.println("Initial Velocity (u) : ");
		u = sc.nextFloat();

		System.out.println("Acceleration (a) : ");
		a = sc.nextFloat();

		System.out.println("Time (t) : ");
		t = sc.nextFloat();

		v = u + a*t;
		s = u + a*t*t;

		System.out.println("Velocity (v) : "+v);
		System.out.println("Distance (s) : "+s);

		}
	}

	