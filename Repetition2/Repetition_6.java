import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int a = 0;
        int count=0;
        double avg = 0;
        int n = s.nextInt();
        int m = s.nextInt();

        if(n > m){
            for(int j=m;j<=n;j++){
                if((j%5==0)||(j%3==0)){
                    sum = sum+j;
                    count++;
                }
            }
        } else{
            for(int j=n;j<=m;j++){
                if((j%5==0)||(j%3==0)){
                    sum = sum+j;
                    count++;
                }
            }
        }
        avg = (double) sum / count;
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f",avg);
    }
}