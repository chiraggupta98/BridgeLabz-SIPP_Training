import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int qty = sc.nextInt();
	    double sum=0;
	    while(qty!=0){
	        double unitprice = sc.nextInt();
	        sum+=unitprice;
	        qty--;
	    }
	    System.out.println(sum);
	}
}
