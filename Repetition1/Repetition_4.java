import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNextInt()){
            int i = sc.nextInt();
            if(i == 0){
                break;
            } else if((i %3 == 0) || (i%5 == 0)){
                continue;
            } else{
                count++;
            }
        }
        System.out.print(count);
    }
}