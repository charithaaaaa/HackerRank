import java.util.Scanner;

public class Timing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // number of test cases

        for(int i = 0; i < T; i++) {
            int X = sc.nextInt();  // minutes before leaving

            if(X >= 30) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
