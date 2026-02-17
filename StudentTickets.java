import java.util.Scanner;

public class StudentTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // number of test cases

        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();  // students
            int M = sc.nextInt();  // tickets
            
            int result;
            if(N > M) {
                result = N - M;
            } else {
                result = 0;
            }

            System.out.println(result);
        }

        sc.close();
    }
}
