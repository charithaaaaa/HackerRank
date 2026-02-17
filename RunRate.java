import java.util.Scanner;

public class RunRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        double runRate = score / 20.0;   

        System.out.printf("%.4f", runRate);

        sc.close();
    }
}
