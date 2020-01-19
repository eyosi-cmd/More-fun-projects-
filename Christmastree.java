import java.util.*;

public class Christmastree {
	private static int s;
	private static int h;

	static void setSegments(int segments){
		s = segments;
}

	static void setHeight(int height){
		h = height;
}

	static int segements(){
	
		return s;
}
	static int height(){
		return h;
}
public static void getSegments(int x, int y){
	int v = 2*y -1;
	for (int i = 0;i < x; i++) {
			int temp = x;
			temp -=i;
		for (int j = y-1;j >= 0;j--) {
			for (int k = 0;k < temp + j; k++) {
				System.out.print(" ");
			}
			int ls = 0; 
			while (ls < ((i*2 - 2*j) + v)) {
				 ++ls;
				System.out.print("*");

			}
			System.out.println();
			
		}
		
	}


}
public static void getBottom(int x, int y){
	int v = 2*(y + x)-2;
	int i = 0, len = 2;
	for(i = 0; i< len; i++) {
	    for (int j = 0;j < v/2;j++) {
			System.out.print(" ");
		}
		System.out.println("*");
	}
		len = (v - 6)/2;
		for (int k = 0;k < len;k++) {
			System.out.print(" ");
		}
			if (v < 7) {
			for (int j = v;0 < j;j--){
				System.out.print("*");
				
			}
		}
			else {
				System.out.print("*******");
				
			}
		System.out.println();
	}
 public static void main(String[] args) {
 	int segments, height;
 	Christmastree gt = new Christmastree();
 	Scanner sc = new Scanner(System.in);
 	System.out.println("Insert segments and height:");
 	segments = sc.nextInt();
 	height  = sc.nextInt();
 	setSegments(segments);
 	setHeight(height);
	gt.getSegments(segements(), height());
	gt.getBottom(segements(), height());

		
}


}