import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

            if(n1 > n2){
                for(;n1>=n2;n2++){
                    System.out.print(n2+" ");
                }
            } else{
                for(;n1<=n2;n1++){
                    System.out.print(n1 + " ");
                }
            }
        s.close();
    }
}