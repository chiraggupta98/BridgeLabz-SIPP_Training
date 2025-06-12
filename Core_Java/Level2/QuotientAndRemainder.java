import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int quo = x/y;
	    int rem = x%y;
	    System.out.println(quo);
	    System.out.println(rem);
	}
}
