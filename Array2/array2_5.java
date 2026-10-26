import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[4][3];
        int[] sum = new int[4];
        for(int i =0;i<4;i++){
            System.out.print((i+1)+"class? ");
            for(int j=0;j<3;j++){
                arr[i][j] = s.nextInt();
                sum[i] = sum[i] + arr[i][j];
            }
        }
        for(int n=0;n<4;n++){
            System.out.println((n+1)+"class : "+ sum[n]);
        }
    }
}