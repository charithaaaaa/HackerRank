import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // number of test cases

        for(int i = 0; i < T; i++) {
            int X = sc.nextInt();  // target runs
            int Y = sc.nextInt();  // current score
            
            int runsNeeded = (X - Y) + 1;
            System.out.println(runsNeeded);
        }

        sc.close();
    }
}
