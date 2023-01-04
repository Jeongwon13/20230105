class MyPoint {
	int x=1;
	int y=2;
	
	public String toString() {
		return "x:" + x + ", y:"+y;
	}
}

class MyPoint2 extends MyPoint{
	int z=3;
	public String toString() {
		return "x:" + x + ", y:"+ y + ", z:"+ z;
				
	}
}

public class OverrideTest2 {

	public static void main(String[] args) {
		MyPoint2 a = new MyPoint2();
		
		System.out.println(a);
	}
}
