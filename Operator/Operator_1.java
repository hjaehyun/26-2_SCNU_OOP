import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int guk = s.nextInt();
        int young = s.nextInt();
        int su = s.nextInt();
        int com = s.nextInt();
        int Average = (guk+young+su+com) / 4;
        
        System.out.println("sum " + (guk+young+su+com));
        System.out.printf("avg %d",Average );
    }
}
