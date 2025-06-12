import java.util.*;
public class VolumeofSphere
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextInt();
		double volume = (4/3)*3.14*Math.pow(radius,3);
		System.out.println(volume +"km");
		System.out.println(volume*1.609 +"km");
	}
}