import java.util.Scanner;

public class SoundFestKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int stokVIP = 5;
        int stokFestival = 25;
        int stokTribune = 35;

        final int HargaVIP = 1500000;
        final int HargaFESTIVAL = 800000;
        final int HargaTRIBUNE = 500000;

        boolean mesinMenyala = true;
        while (mesinMenyala) {
            System.out.println("  === UNIVERSITAS PERTAMINA SOUNDFEST 2026 ===");
            System.out.println("Sisa Stok Tiket:");
            System.out.println("1. VIP      - Rp " + HargaVIP + " (Sisa: " + stokVIP + ")");
            System.out.println("2. Festival - Rp " + HargaFESTIVAL + " (Sisa: " + stokFestival + ")");
            System.out.println("3. Tribune  - Rp " + HargaTRIBUNE + " (Sisa: " + stokTribune + ")");
            System.out.println("4. Matikan Mesin (Teknisi)");
            System.out.print("Pilih menu: ");
            
            int pilihan = input.nextInt();

            if (pilihan == 4) {
                System.out.println("Sistem akan mati, sampai jumpa");
                mesinMenyala = false;
                break;
            }

            if (pilihan < 1 || pilihan > 3) {
                System.out.println("Menu yang anda masukkan tidak tersedia.");
                continue;
            }

            System.out.print("Masukkan jumlah tiket yang ingin anda beli: ");
            int jmlBeli = input.nextInt();

            int hargaKategori = 0;
            int sisaStok = 0;
            int syaratUsia = 0;
            String namaKategori = "";

            if (pilihan == 1) {
                hargaKategori = HargaVIP; sisaStok = stokVIP; syaratUsia = 18; namaKategori = "VIP";
            } else if (pilihan == 2) {
                hargaKategori = HargaFESTIVAL; sisaStok = stokFestival; syaratUsia = 15; namaKategori = "Festival";
            } else {
                hargaKategori = HargaTRIBUNE; sisaStok = stokTribune; syaratUsia = 0; namaKategori = "Tribune";
            }

            if (jmlBeli > sisaStok) {
                System.out.println("Gagal! Stok " + namaKategori + " tidak mencukupi (Sisa: " + sisaStok + ").");
                continue; 
            }

            int tiketBerhasil = 0;
            boolean batalDarurat = false;

            for (int i = 1; i <= jmlBeli; i++) {
                int usia;
                while (true) {
                    System.out.print("Masukkan usia untuk Tiket ke-" + i + " (ketik -1 untuk batal): ");
                    usia = input.nextInt();

                    if (usia == -1) {
                        batalDarurat = true;
                        break;
                    }
                    if (usia > 0 && usia < 120) { 
                        break;
                    }
                    System.out.println("Usia tidak logis. Silakan masukkan kembali.");
                }

                if (batalDarurat) {
                    System.out.println("--- Transaksi Dibatalkan Secara Paksa ---");
                    break; 
                }

                // Verifikasi syarat usia
                if (usia >= syaratUsia) {
                    System.out.println("> Tiket ke-" + i + " Berhasil diverifikasi.");
                    tiketBerhasil++;
                } else {
                    System.out.println("> Tiket ke-" + i + " Gagal: Usia minimal " + syaratUsia + " tahun.");
                }
            }

            if (!batalDarurat && tiketBerhasil >= 0) {
                long totalTagihan = (long) tiketBerhasil * hargaKategori;
                
                if (pilihan == 1) stokVIP -= tiketBerhasil;
                else if (pilihan == 2) stokFestival -= tiketBerhasil;
                else stokTribune -= tiketBerhasil;

                System.out.println(" --- NOTA PEMBAYARAN --- ");
                System.out.println("Kategori       : " + namaKategori);
                System.out.println("Tiket Berhasil : " + tiketBerhasil);
                System.out.println("Total Tagihan  : Rp " + totalTagihan);
                System.out.println("-----------------------");
            }
        }
        input.close();
    }
}