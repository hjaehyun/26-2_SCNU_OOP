import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 0;

        while(s.hasNextInt()){
            int i = s.nextInt();
            if((i >100.0) || (i<0)){
                break;
            }
            else{
                count++;
                sum = sum + i;
                avg = (double) sum / count;
            }
        }
        System.out.printf("sum : %d%n", sum);
        System.out.printf("avg : %.1f", avg );
        s.close();
    }
}