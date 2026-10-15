import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        while(true){
            int i = s.nextInt();
            if(i == 0){
                break;
            } else if( i % 2 == 0){
                even++;
            } else{
                odd++;
            }
        }
        System.out.println("odd : "+ odd);
        System.out.println("even : " + even);
    }
}