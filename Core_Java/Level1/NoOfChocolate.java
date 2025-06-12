import java.util.*;
public class NoOfChocolate
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choco=sc.nextInt();
		int child=sc.nextInt();
		
		int chocoget=choco/child;
		int chocoleft=choco%child;
		System.out.println(chocoget);
		System.out.println(chocoleft);
	}
}
