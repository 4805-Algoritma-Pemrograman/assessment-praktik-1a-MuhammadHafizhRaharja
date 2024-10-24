import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input jam lembur
        System.out.print("Masukkan jam lembur: ");
        int jamLembur = scanner.nextInt();
        
        double honor = 0;
        if (jamLembur <= 16) {
            honor = jamLembur * 10000;
        } else {
            honor = (16 * 10000) + ((jamLembur - 16) * 15000);
        }
        
        // Output
        System.out.printf("Total jam lembur: %d\n", jamLembur);
        System.out.printf("Honor lembur: %.1f\n", honor);
        
        scanner.close();
    }
}
