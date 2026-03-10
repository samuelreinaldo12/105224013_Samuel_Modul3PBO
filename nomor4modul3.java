import java.util.Scanner;

public class nomor4modul3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai ujiannya: ");
        int nilai = input.nextInt();
         System.out.println("Masukkan persentase absensi: ");
        int presensi = input.nextInt();

        String status = (nilai >=75 && presensi >= 80) ? "Lulus cuy" : "Tidak lulus, ntnt";

        System.out.println("Status: " + status);
        input.close();
    }
}