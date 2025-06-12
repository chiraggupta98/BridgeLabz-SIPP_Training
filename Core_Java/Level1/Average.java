import java.util.*;
public class Average
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int math = sc.nextInt();
		int physics = sc.nextInt();
		int chemistry = sc.nextInt();
		int avg = (math+physics+chemistry)/3;
		System.out.print(avg);
	}
}
