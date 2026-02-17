
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // number of test cases

        for(int i = 0; i < T; i++) {
            int X = sc.nextInt();  // total points
            int N = sc.nextInt();  // test cases passed

            int pointsPerTestCase = X / 10;
            int score = pointsPerTestCase * N;

            System.out.println(score);
        }

        sc.close();
    }
}
