import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTrip = 0; // Total jarak trip
        int omzetTertinggi = 0; // Omzet tertinggi
        String driverTertinggi = ""; // Driver dengan omzet tertinggi
        
        // Loop untuk input data driver
        while (true) {
            System.out.print("Masukan nama driver [Beliau/Mereka/Kita]: ");
            String namaDriver = scanner.next(); // Nama driver
            System.out.print("lama trip (km): ");
            int lamaTrip = scanner.nextInt(); // Lama trip dalam km
            
            totalTrip += lamaTrip; // Tambahkan trip ke total
            
            // Hitung omzet untuk trip ini
            int omzet = lamaTrip * 13000; 
            
            // Cek apakah omzet ini lebih tinggi dari omzet tertinggi sebelumnya
            if (omzet > omzetTertinggi) {
                omzetTertinggi = omzet; // Update omzet tertinggi
                driverTertinggi = namaDriver; // Update driver tertinggi
            }
            
            // Tanya apakah ingin memasukkan data lagi
            System.out.print("Input lagi (Y/N)?: ");
            String inputLanjut = scanner.next(); // Input pilihan Y/N
            if (!inputLanjut.equalsIgnoreCase("Y")) {
                break; // Keluar dari loop jika bukan Y
            }
        }
        
        // Output total trip dan driver dengan omzet tertinggi
        System.out.println("Total trip yang dilakukan driver = " + totalTrip);
        System.out.println("Omzet tertinggi diperoleh oleh " + driverTertinggi + " dengan total Omzet = " + omzetTertinggi);
    }
}
