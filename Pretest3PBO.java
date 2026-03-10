import java.util.Scanner;

public class Pretest3PBO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("    Kelayakan Pendonor Darah    ");

        System.out.print("Masukkan usia anda (Tahun):  ");
        int usia = input.nextInt();

        System.out.print("Masukkan berat badan anda (Kg):  ");
        float beratBadan = input.nextFloat();

        System.out.print("Masukkan kadar hemogoblin anda:  ");
        float hemogoblin = input.nextFloat();

        if (usia >= 17 && usia <= 65) {
            
            if (beratBadan >= 45.0) {
                
                if (hemogoblin >= 12.5 && hemogoblin <= 17.0) {
                    System.out.println("Selamat! Anda memenuhi semua kriteria dan anda layak mendonorkan darah anda.");
                } else {
                    System.out.println("Tidak bisa: Kadar hemoglobin tidak normal (Normalnya adalah : 12.5 - 17.0 g/dL).");
                }
                
            } else {
                System.out.println("Tidak bisa: Berat badan minimal adalah 45 kg.");
            }
            
        } else {
            System.out.println("Tidak bisa: Usia harus berada dalam rentang 17 - 65 tahun.");
        }

        input.close();
    }
}