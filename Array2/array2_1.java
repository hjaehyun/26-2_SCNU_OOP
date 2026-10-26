import java.util.Scanner;
public class array2_1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i =0;i<10;i++){
            int n = s.nextInt();
            arr[n] ++;
        }
        for(int i =1;i<=6;i++){
            System.out.println(i +" : " + arr[i] );
        }
    }
}