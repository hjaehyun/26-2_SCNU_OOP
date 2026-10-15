import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int star = s.nextInt();
        for(int n =star;1<=n;n--){

            for(int b=1;b<=star-n;b++){
                System.out.print(" ");
            }
            for(int a=1;a<=(n*2)-1;a++){
                System.out.print("*");
            }
        System.out.println();
        }

        for(int i = 2; i<=star;i++) {
	        for(int t=1; t <=star-i ;t++) {
		        System.out.print(" ");
	        }
	        for(int j=1;j<=(i*2)-1;j++) {
		        System.out.print("*");
	        }
	        System.out.println();
        }
    }
}