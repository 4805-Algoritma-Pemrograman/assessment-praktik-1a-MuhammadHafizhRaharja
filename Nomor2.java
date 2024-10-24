import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tripBeliau = 0, tripMereka = 0, tripKita = 0;
        double omzetBeliau = 0, omzetMereka = 0, omzetKita = 0;
        double biayaPerKm = 13000;
        int totalTrip = 0;

        String lagi;

        do {
            String driver = input.next();

            int lamaTrip = input.nextInt();

            switch (driver.toLowerCase()) {
                case "beliau":
                    tripBeliau += lamaTrip;
                    omzetBeliau += lamaTrip * biayaPerKm;
                    break;
                case "mereka":
                    tripMereka += lamaTrip;
                    omzetMereka += lamaTrip * biayaPerKm;
                    break;
                case "kita":
                    tripKita += lamaTrip;
                    omzetKita += lamaTrip * biayaPerKm;
                    break;
                default:
                    System.out.println("Nama driver tidak valid!");
                    break;
            }

            totalTrip += lamaTrip;

            lagi = input.next();

        } while (lagi.equalsIgnoreCase("Y"));

        String driverTertinggi;
        double omzetTertinggi;
        if (omzetBeliau >= omzetMereka && omzetBeliau >= omzetKita) {
            driverTertinggi = "Beliau";
            omzetTertinggi = omzetBeliau;
        } else if (omzetMereka >= omzetBeliau && omzetMereka >= omzetKita) {
            driverTertinggi = "Mereka";
            omzetTertinggi = omzetMereka;
        } else {
            driverTertinggi = "Kita";
            omzetTertinggi = omzetKita;
        }

        System.out.println("Total trip yang dilakukan driver = " + totalTrip);
        System.out.println("Omzet tertinggi diperoleh oleh " + driverTertinggi + " dengan total Omzet = " + omzetTertinggi);

        input.close();
    }
}
