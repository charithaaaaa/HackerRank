import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N == 404) {
            System.out.println("not found");
        } else {
            System.out.println("found");
        }

        sc.close();
    }
}
