
package pertemuan_terakhir;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Sepatu> daftarSepatu = new ArrayList<>();
        
        System.out.print("Masukkan Nama Pelanggan: ");
        String nama = sc.nextLine();
        
        System.out.print("Jumlah Sepatu yang Ingin Dicuci: ");
        int jumlah = sc.nextInt();
        
        //perulangan dan penyimpanan
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Sepatu ke-" + (i+i) + "---");
            System.out.print("Nama Sepatu: ");
            String namaSepatu = sc.nextLine();
            
            System.out.print("Ukuran Sepatu: ");
            int ukuran = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Pilih Jenis Pembersihan: ");
            System.out.println("1. Reguler Cleaning  = Rp 20.000 (5 jam - 1 hari)");
            System.out.println("2. Fast Cleaning     = Rp 40.000 (1 jam)");
            System.out.println("3. Deep Cleaning     = Rp 60.000 - 100.000 (Perawatan menyeluruh");
            System.out.print("Pilihan (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            
            String layanan = "";
            double harga = 0;
            
            //pemilihan layanan dan harga
            switch (pilihan){
                case 1:
                    layanan = "Reguler Cleaning";
                    harga = 20000;
                    break;
                case 2:
                    layanan = "Fast Cleaning";
                    harga = 40000;
                    break;
                case 3:
                    System.out.println("Pilih Tingkat Deep Cleaning:");
                    System.out.println("  a. Mild    = Rp 60.000");
                    System.out.println("  b. Regular = Rp 80.000");
                    System.out.println("  c. Hard    = Rp 100.000");
                    System.out.print("Pilihan (a/b/c): ");
                    String tingkat = sc.nextLine().toLowerCase();

                    if (tingkat.equals("a")) {
                        layanan = "Deep Cleaning (Mild)";
                        harga = 60000;
                    } else if (tingkat.equals("b")) {
                        layanan = "Deep Cleaning (Regular)";
                        harga = 80000;
                    } else if (tingkat.equals("c")) {
                        layanan = "Deep Cleaning (Hard)";
                        harga = 100000;
                    } else {
                        System.out.println("Pilihan tidak valid. Default: Deep Cleaning (Mild)");
                        layanan = "Deep Cleaning (Mild)";
                        harga = 60000;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Default: Regular Cleaning.");
                    layanan = "Regular Cleaning";
                    harga = 20000;
            }

            Sepatu sepatu = new Sepatu(namaSepatu, ukuran, layanan, harga);
            daftarSepatu.add(sepatu);
        }
            }
        }
    }
}
