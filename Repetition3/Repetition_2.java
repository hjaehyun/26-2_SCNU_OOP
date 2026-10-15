import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count= 1;
        while((n*count)<100){
            if((n*count)%10==0){
                System.out.print(n*count + " ");
                break;
            }else{
                System.out.print(n*count + " ");
            }
            count++;
        }
    }
}