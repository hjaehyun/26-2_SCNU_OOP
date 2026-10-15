import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int star = s.nextInt();
        for(int i =1;i<=star;i++){
            for(int j=(2*star);i*2<j;j--){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}