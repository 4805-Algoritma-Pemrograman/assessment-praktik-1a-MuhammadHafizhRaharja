import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jamLembur = scanner.nextInt();
        double honor = 0;
        if (jamLembur < 16) {
            // Hitung lembur di bawah 16 jam
            honor = jamLembur * 100000;
        } else if (jamLembur == 16) {
            // Hitung lembur pas 16 jam
            honor = jamLembur * 100000;
        } else if (jamLembur > 16) {
            // Hitung lembur di atas 16 jam
            honor = jamLembur * 110000;
        }
        System.out.println("Honor lembur: " + honor);
        scanner.close();
    }
}
