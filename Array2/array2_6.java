import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[5][5];
        arr[0][0]=1;
        arr[0][2]=1;
        arr[0][4]=1;
        int count = 1;
        for(int i =1;i<5;i++){
            for(int j=0;j<5;j++){
                int left=0;
                int right=0;
                if(j>0){
                    left=arr[i-1][j-1];
                }
                if(j<4){
                    right=arr[i-1][j+1];
                }
                arr[i][j]=left+right;
            }
        }
        for(int x=0;x<5;x++){
            for(int y=0;y<5;y++){
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
}