import java.util.Scanner;

public class posttestmodul3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double saldo = 500000;
        double MinimalSaldo = 50000;
        int pilihan;

        do {
            System.out.println("  Menu ATM Sederhana  ");
            System.out.println("1. Cek saldo");
            System.out.println("2. Setor tunai");
            System.out.println("3. Tarik tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu:  ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo lu saat ini: Rp " + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah yang ingin kalian setor: ");
                    int setor = input.nextInt();
                    saldo += setor;
                    System.out.println("Setor tunai lu berhasil. Saldo lu sekarang: Rp " + saldo);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah yang ingin lu tarik: ");
                    int tarik = input.nextInt();
                    if (saldo - tarik < MinimalSaldo) {
                        System.out.println("Penarikan dibatalkan! Batas saldo minimalnya adalah Rp " + MinimalSaldo);
                    } else {
                        saldo -= tarik;
                        System.out.println("Tarik tunai berhasil ni cuy. Ni saldo lu sekarang: Rp " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih udah menggunakan ATM kami.");
                    break;
                default:
                    System.out.println("Pilihan kagak valid!");
            }
        } while (pilihan != 4);

        input.close();
    }
}