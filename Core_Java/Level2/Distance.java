import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int distance = sc.nextInt();
	    int yard = 3 * distance;
	    int mile = 1760 * yard;
	    System.out.println("The distance in yards is"+yard +" while the distance in miles is "+mile);
	}
}
