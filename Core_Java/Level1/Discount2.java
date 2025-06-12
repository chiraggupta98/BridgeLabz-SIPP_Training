import java.util.*;
public class Discount2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fee= sc.nextInt();
		int dp= sc.nextInt();
		int da=fee-((dp*fee)/100);
		System.out.print(da);
	}
}
