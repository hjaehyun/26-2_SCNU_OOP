import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        if(n>m){
            for(int i=1;i<=9;i++){
                for(int j = n;m<=j;j--){
                    System.out.printf("%d * %d = %2d   ",j,i,(j*i));
                }
                System.out.println("");
            }
        } else{
            for(int i=1;i<=9;i++){
                for(int j =n;j<=m;j++){
                    System.out.printf("%d * %d = %2d   ",j,i,(j*i));
                }
                System.out.println("");
            }
        }
    }
}