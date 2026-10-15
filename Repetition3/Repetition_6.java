import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =1;i<=n;i++){
            int tmp =1;
            for(int j=n;i<j;j--){
                System.out.print("  ");
            }
            for(int k=0;k<i;k++){
                System.out.print(tmp+" ");
                tmp++;
            }
            System.out.println();
        }
    }
}