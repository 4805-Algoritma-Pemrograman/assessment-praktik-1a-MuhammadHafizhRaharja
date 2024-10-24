import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inisialisasi variabel
        int totalTrip = 0;
        int[] omzet = new int[3]; // 0: Beliau, 1: Mereka, 2: Kita
        String[] drivers = {"Beliau", "Mereka", "Kita"};
        String driverTertinggi = "";
        int maxOmzet = 0;
        
        // Loop untuk input data driver
        while (true) {
            System.out.print("Masukan nama driver [Beliau/Mereka/Kita]: ");
            String namaDriver = scanner.next(); // Nama driver
            
            // Cek jika nama driver valid
            boolean isValidDriver = false;
            for (String driver : drivers) {
                if (driver.equalsIgnoreCase(namaDriver)) {
                    isValidDriver = true;
                    break;
                }
            }
            
            if (!isValidDriver) {
                System.out.println("Nama driver tidak valid. Silakan coba lagi.");
                continue; // Kembali ke awal loop jika nama tidak valid
            }
            
            System.out.print("lama trip (km): ");
            int lamaTrip = scanner.nextInt(); // Lama trip dalam km
            
            // Hitung omzet
            int omzetDriver = lamaTrip * 13000; // Hitung omzet
            for (int i = 0; i < drivers.length; i++) {
                if (drivers[i].equalsIgnoreCase(namaDriver)) {
                    omzet[i] += omzetDriver; // Tambahkan ke omzet driver
                    break; // Keluar dari loop setelah menemukan driver
                }
            }
            totalTrip += lamaTrip; // Tambahkan ke total trip
            
            // Tanya apakah ingin memasukkan data lagi
            System.out.print("Input lagi (Y/N)?: ");
            String inputLanjut = scanner.next(); // Input pilihan Y/N
            if (!inputLanjut.equalsIgnoreCase("Y")) {
                break; // Keluar dari loop jika bukan Y
            }
        }
        
        // Tentukan driver dengan omzet tertinggi
        for (int i = 0; i < omzet.length; i++) {
            if (omzet[i] > maxOmzet) {
                maxOmzet = omzet[i]; // Update omzet tertinggi
                driverTertinggi = drivers[i]; // Update driver tertinggi
            }
        }
        
        // Output total trip dan driver dengan omzet tertinggi
        System.out.println("Total trip yang dilakukan driver = " + totalTrip);
        System.out.println("Omzet tertinggi diperoleh oleh " + driverTertinggi + " dengan total Omzet = " + maxOmzet);
        
        scanner.close(); // Tutup scanner
    }
}
