import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if(a == 0){
            System.out.print("zero");
        }
        else if(a >0){
            System.out.print("plus");
        }
        else{
            System.out.print("minus");
        }
    }
}