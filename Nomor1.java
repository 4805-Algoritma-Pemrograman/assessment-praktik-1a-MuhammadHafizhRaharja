import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] jamLemburList = {12, 20};

        for (int jamLembur : jamLemburList) {
            double honor;
            if (jamLembur <= 16) {
                honor = jamLembur * 10000;
            } else {
                honor = (16 * 10000) + ((jamLembur - 16) * 15000);
            }

            System.out.printf("Total jam lembur: %d\n", jamLembur);
            System.out.printf("Honor lembur: %.1f\n", honor);
        }

        scanner.close();
    }
}
