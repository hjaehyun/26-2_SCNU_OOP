import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double yard = s.nextDouble();
        System.out.print("yard? ");
        double meter = yard * 91.44;
        System.out.printf("%.1fyard = %.1fcm", yard, meter);
    }
}