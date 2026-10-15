import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int n1 = s.nextInt();
        double avg = 0;
        for(int i =1;i<=n1;i++){
            int tmp = s.nextInt();
            sum = sum + tmp;
        }
        avg = (double) sum / n1;
        System.out.printf("%.2f",avg);
    }
}