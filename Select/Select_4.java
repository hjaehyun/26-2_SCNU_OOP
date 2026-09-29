import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Number? ");
        if(a == 1){
            System.out.print("dog");
        }
        else if(a ==2){
            System.out.print("cat");
        }
        else if (a ==3){
            System.out.print("chick");
        }
        else{
            System.out.print("I don't know.");
        }
    }
}