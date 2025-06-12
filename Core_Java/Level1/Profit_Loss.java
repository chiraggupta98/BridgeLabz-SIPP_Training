import java.util.*;
public class Profit_Loss{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cp=sc.nextInt();
		int sp=sc.nextInt();
		if(sp>cp){
		    int p=sp-cp;
		    double pper=(((double)p/cp)*100);
		    System.out.println(p);
		    System.out.println(pper+"%");
		}
		else{
		    int l=Math.abs(cp-sp);
		    double lper=(((double)l/cp)*100);
		    System.out.println(l);
		    System.out.println(lper+"%");
		}
	}
}
