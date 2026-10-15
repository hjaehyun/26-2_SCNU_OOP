import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int avg = 0;
        for(int i = 0;i<20;i++){
            int n = s.nextInt();
            if(n == 0){
                break;
            } else{
                sum = sum + n;
                count++;
            }
        }
        avg = sum / count;
        System.out.printf("%d %d",sum,avg);
    }
}