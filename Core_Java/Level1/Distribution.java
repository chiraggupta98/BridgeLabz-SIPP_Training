import java.util.Scanner;

public class Distribution {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int pen = 14;
	    int student = 3;
	    int res = pen/student;
	    int ans = pen%student;
	    System.out.println(res);
	    System.out.println(ans);
	}
}
