import java.util.Scanner;

public class DSP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();  

        int totalCost = 4 * X;

        if(totalCost <= 1000) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
