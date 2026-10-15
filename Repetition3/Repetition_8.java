import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count =1;
        for(int i =1;i<=n;i++){
            for(int k=1;k<i;k++){
                System.out.print("  ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}