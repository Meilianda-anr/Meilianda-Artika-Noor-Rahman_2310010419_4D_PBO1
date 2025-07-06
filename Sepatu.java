
package pertemuan_terakhir;

import java.util.*;

public class Sepatu {
    private String namaSepatu;
    private int ukuran;
    private String layanan;
    private double harga;
    
    public Sepatu(String namaSepatu, int ukuran, String layanan, double harga){
        this.namaSepatu = namaSepatu;
        this.ukuran = ukuran;
        this.layanan = layanan;
        this.harga = harga;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public void tampilkan(){
        System.out.println("Nama Speatu: " + namaSepatu);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Layanan: " + layanan);
        System.out.println("Harga: Rp " + (int) harga);
        System.out.println("--------------------------");
    }
}
