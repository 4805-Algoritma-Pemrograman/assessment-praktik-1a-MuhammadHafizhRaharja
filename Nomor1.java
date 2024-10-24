import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jamLembur = scanner.nextInt();
        double honorLembur;

        if (jamLembur <= 16) {
            honorLembur = jamLembur * 100000.00;
        } else {
            honorLembur = 16 * 100000.00 + (jamLembur - 16) * 110000.00;
        }

        System.out.printf("%.2f%n", honorLembur);

        scanner.close();
    }
}
