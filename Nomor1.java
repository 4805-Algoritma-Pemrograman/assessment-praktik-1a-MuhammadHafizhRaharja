import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jamLembur = scanner.nextInt();
        double honor;

        if (jamLembur <= 16) {
            honor = jamLembur * 100000.00;
        } else {
            honor = 16 * 100000.00 + (jamLembur - 16) * 110000.00;
        }

        System.out.printf("%.2f%n", honor);

        scanner.close();
    }
}
