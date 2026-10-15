import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
        for(int a=1;a<=n;a++){
            for(int b=1;b<=a;b++){
                System.out.print("  ");
            }
            for(int c=1;c<=n-a;c++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}