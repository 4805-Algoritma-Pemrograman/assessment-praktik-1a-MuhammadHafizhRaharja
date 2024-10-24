import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jamLembur = scanner.nextInt();
        double honor;
        
        if (jamLembur <= 16) {
            honor = jamLembur * 10000;
        } else {
            honor = (16 * 10000) + ((jamLembur - 16) * 15000);
        }
        // Output
        System.out.printf("%.1f\n", honor);
    }
}
