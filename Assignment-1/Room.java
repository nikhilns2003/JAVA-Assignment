import java.util.Scanner;

public class Room {
	public static void main(String[] args) {
		Float  L,W,H,DL,DH,WL,WH;
		double WallArea,DoorArea,WindowArea,PaintArea,WhitewashArea;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter room Length :");
		L = sc.nextFloat();
		System.out.println("Enter room Width :");
		W = sc.nextFloat();
		System.out.println("Enter room Height :");
		H = sc.nextFloat();

		System.out.println("Enter Window length :");
		WL = sc.nextFloat();
		System.out.println("Enter Window Height :");
		WH = sc.nextFloat();

		System.out.println("Enter Door length :");
		DL = sc.nextFloat();
		System.out.println("Enter Door Height :");
		DH = sc.nextFloat();

		WallArea = 2 * (L + W) *H;
		DoorArea = DL * DH;
		WindowArea = 2 * (WL * WH);

		
		PaintArea = WallArea - (DoorArea + WindowArea);
		WhitewashArea = L * W;

		System.out.println("Area to be painted : "+PaintArea);
		System.out.println("Area to be whitewashed : "+WhitewashArea);

		}
	}
		
		

