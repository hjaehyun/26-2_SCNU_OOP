import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m_height = s.nextInt();
        int m_weight = s.nextInt();
        int k_height = s.nextInt();
        int k_weight = s.nextInt();

        if((m_height > k_height)&&(m_weight>k_weight)){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
}