import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jamLembur = scanner.nextInt();
        double honor = 0;

        if (jamLembur < 16) {
            honor = jamLembur * 100000;
        } else if (jamLembur == 16) {
            honor = jamLembur * 100000;
        } else if (jamLembur > 16) {
            honor = 16 * 100000 + (jamLembur - 16) * 110000;
        }

        System.out.printf("Honor lembur: %.2f%n", honor);
        scanner.close();
    }
}
