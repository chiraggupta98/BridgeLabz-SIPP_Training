import java.util.Scanner;

public class Traingle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        int area = (1/2)*base*height;
        System.out.println(area);
    }
}
