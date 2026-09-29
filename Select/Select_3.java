import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        if((a %4 == 0)&& (a % 100 != 0) | (a % 400 == 0)){
            System.out.print("leap year");
        }
        else{
            System.out.print("common year");
        }
    }
}