import java.util.*;
public class ConversionInchToFoot{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double height = sc.nextInt();
		double inch = height*2.54;
		double foot = 12*inch;
		System.out.println("Inch "+inch);
		System.out.println("Foot "+ foot);
	}
}