import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int count = 1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(j*count + " ");
            }
            System.out.println("");
            count++;
        }
    }
}