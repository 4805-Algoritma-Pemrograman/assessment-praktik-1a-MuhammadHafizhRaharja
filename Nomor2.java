import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTrip = 0;
        int omzetTertinggi = 0;
        String driverTertinggi = "";
        
        while (true) {
            System.out.print("Masukan nama driver [Beliau/Mereka/Kita]: ");
            String namaDriver = scanner.next();
            System.out.print("lama trip (km): ");
            int lamaTrip = scanner.nextInt();
            totalTrip += lamaTrip;

            int omzet = lamaTrip * 13000;
            if (omzet > omzetTertinggi) {
                omzetTertinggi = omzet;
                driverTertinggi = namaDriver;
            }
            
            System.out.print("Input lagi (Y/N)?: ");
            String inputLanjut = scanner.next();
            if (!inputLanjut.equalsIgnoreCase("Y")) {
                break;
            }
        }
        
        System.out.printf("Total trip yang dilakukan driver = %d\n", totalTrip);
        System.out.printf("Omzet tertinggi diperoleh oleh %s dengan total Omzet = %d\n", driverTertinggi, omzetTertinggi);
    }
}
