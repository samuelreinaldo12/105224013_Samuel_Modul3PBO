import java.util.Scanner;

public class nomor2modul3 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int pinbenar = 120806;
        int percobaan = 0;
        int batasnyoba = 3;

        while (percobaan < batasnyoba){
            System.out.print("Masukkkan PIN anda: ");
            int inputPin = input.nextInt();
            percobaan++;

            if (inputPin == pinbenar) {
                System.out.println("Anda berhasil masuk");
                break;
            } else {
                if (percobaan < batasnyoba) {
                    System.out.println("Yg lu masukkin salah. Sisa lu nyoba cuma: " + (batasnyoba-percobaan));
                } else {
                    System.out.println("yahahahah keblokir");
                }
            }
        }
        input.close();
    }
}