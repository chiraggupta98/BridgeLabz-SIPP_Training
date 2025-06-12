import java.util.*;

public class CityDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter the destination city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = sc.nextInt();
        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("\nThe Total Distance travelled by " + name + " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " + totalTime + " minutes.");
    }
}
