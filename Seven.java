import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 7 == 0) {
            System.out.println("lucky");
        } else {
            System.out.println("unlucky");
        }

        sc.close();
    }
}
