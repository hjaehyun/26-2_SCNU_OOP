import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        for(int i =1;i<=10;i++){
            int tmp = s.nextInt();
            if(tmp %2 == 0){
                even++;
            } else{
                odd++;
            }
        }
        System.out.println("even : " + even);
        System.out.println("odd : " + odd);
    }
}