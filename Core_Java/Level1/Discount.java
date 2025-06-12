import java.util.*;
public class Discount
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fee= 125000;
		int dp=10;
		int da=fee-((dp*125000)/100);
		System.out.print(da);
	}
}
