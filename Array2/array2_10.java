import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char[][] arr = new char[3][5];
        for(int i =0;i<3;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=s.next().charAt(0);
            }
        }
        for(int a=0;a<3;a++){
            for(int b=0;b<5;b++){
                System.out.print(Character.toLowerCase(arr[a][b])+" ");
            }
            System.out.println();
        }
    }
}