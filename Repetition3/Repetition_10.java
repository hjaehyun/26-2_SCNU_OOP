import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int tmp =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(tmp + " ");
                if(tmp==9){
                    tmp = 1;
                } else{
                    tmp = tmp + 2;
                }
            }
            System.out.println();
        }
    }
}