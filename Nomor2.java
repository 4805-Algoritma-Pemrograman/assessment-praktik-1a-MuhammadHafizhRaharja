import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> totalTrip = new HashMap<>();
        String[] drivers = {"Beliau", "Mereka", "Kita"};

        // Inisialisasi total trip untuk setiap driver
        for (String driver : drivers) {
            totalTrip.put(driver, 0);
        }

        String inputLanjut;
        do {
            System.out.print("Masukan nama driver [Beliau/Mereka/Kita]: ");
            String namaDriver = scanner.next();
            System.out.print("lama trip (km): ");
            int lamaTrip = scanner.nextInt();

            // Hitung omzet dan tambahkan ke total trip driver
            totalTrip.put(namaDriver, totalTrip.get(namaDriver) + lamaTrip);

            // Tanyakan apakah ingin input lagi
            System.out.print("Input lagi (Y/N)?: ");
            inputLanjut = scanner.next();
        } while (inputLanjut.equalsIgnoreCase("Y"));

        // Hitung total trip dan omzet
        int totalKeseluruhan = 0;
        String driverTertinggi = "";
        int omzetTertinggi = 0;

        for (String driver : drivers) {
            int trip = totalTrip.get(driver);
            totalKeseluruhan += trip;
            int omzet = trip * 13000;

            if (omzet > omzetTertinggi) {
                omzetTertinggi = omzet;
                driverTertinggi = driver;
            }
        }

        System.out.printf("Total trip yang dilakukan driver = %d\n", totalKeseluruhan);
        System.out.printf("Omzet tertinggi diperoleh oleh %s dengan total Omzet = %d\n", driverTertinggi, omzetTertinggi);

        scanner.close();
    }
}

