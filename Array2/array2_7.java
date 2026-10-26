import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];
        int[][] arr3 = new int[2][3];

        System.out.println("first array");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=s.nextInt();
            }
        }
        System.out.println("second array");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr2[i][j]=s.nextInt();
            }
        }
        for(int h=0;h<2;h++){
            for(int k=0;k<3;k++){
                arr3[h][k] = arr1[h][k]*arr2[h][k];
                System.out.print(arr3[h][k] + " ");
            }
            System.out.println();
        }
        
    }
}