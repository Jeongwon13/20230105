class Point {
	
	int x;
	int y;
	
	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}
class Point3D extends Point{
	int z;
	String getLocation() {
		return "x:" + x + ", y:" + y +", z:" + z;
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		Point3D a = new Point3D();
		a.x = 1;
		a.y = 2;
		a.z = 3;
		System.out.println(a.getLocation());
	}

}
