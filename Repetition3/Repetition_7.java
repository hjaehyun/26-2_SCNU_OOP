import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int tmp = 0;
        char a ='A';
        for(int i =1;i<=n;i++){
            for(int j=n;i<=j;j--){
                System.out.print(a + " ");
                a++;
            }
            for(int k=0;k<i-1;k++){
                System.out.print(tmp+" ");
                tmp++;
            }
            System.out.println();
        }
    }
}