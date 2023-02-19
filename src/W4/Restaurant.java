import java.util.*;

public class Restaurant {
    public String[] nama_makanan;
    public double[] harga_makanan;
    public int[] stok;
    public static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;

    }

    public void tampi1MenuMakanan() {
        for (int i = 0; i <= 0; i++) {
            if (isOutOfStock(i))
                System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp." + harga_makanan[i]);
        }
    }

    public boolean isOutOfStock(int ld) {
        if (stokt[id]) {
            return true;
        } else {
            return false;
        }

    }
}
