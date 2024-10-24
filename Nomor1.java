import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan total jam lembur: ");
        int jamLembur = input.nextInt();
        
        double honorLembur;
        
        if (jamLembur <= 16) {
            honorLembur = jamLembur * 10000;
        } else {
            honorLembur = (16 * 10000) + ((jamLembur - 16) * 15000);
        }
        
        System.out.println("Total jam lembur: " + jamLembur);
        System.out.println("Honor lembur: " + honorLembur);
        
        input.close();
    }
}

// Program Total_Jam_Lembur;

// Deklarasi :

// VARCHAR jamLembur : integer;
// VARCHAR honorLembur : double;

// Algoritma :

// INPUT jamLembur;
// IF (jamLembur <= 16) THEN
// 	CALCULATE honorLembur = jamLembur * 10000;
// ELSE 
// 	CALCULATE honorLembur = (16 * 10000) + ((jamLembur - 16) * 15000);
// END IF
// PRINT ("Total jam lembur: " + jamLembur);
// PRINT ("Honor lembur: " + honorLembur);
// END
