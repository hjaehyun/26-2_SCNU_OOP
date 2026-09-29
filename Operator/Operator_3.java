import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int width = s.nextInt() + 5;
        int length = s.nextInt() * 2;

        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.print("area = " + (width * length));

    }
}