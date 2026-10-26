import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr = new int[100];
        for(int i=0;i<100;i++){
            int n = s.nextInt();
            if(n==0){
                break;
            }
            n = n/10;
            arr[n]++;
        }
        for(int i =10;i>=0;i--){
            if(arr[i]>0){
                System.out.println(i*10 + " : " + arr[i] + " person");
            }
        }
    }
}