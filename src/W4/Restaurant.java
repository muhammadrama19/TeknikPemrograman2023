import java.util.*;

public class Restaurant{
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    /*saya menambahkan setter getter untuk melakukan encapsulation. Tidak semua membutuhkan contohnya id tidak membutuhkannya*/

    public String getNama_makanan(byte id) {
        return this.nama_makanan[id];
    }

    public void setNama_makanan(byte id, String nama_makanan) {
        this.nama_makanan[id] = nama_makanan;
    }

    public double getHarga_makanan(byte id) {
        return this.harga_makanan[id];
    }

    public void setHarga_makanan(byte id, double harga_makanan) {
        this.harga_makanan[id] = harga_makanan;
    }

    public int getStok(byte id) {
        return this.stok[id];
    }

    public void setStok(byte id, int stok) {
        this.stok[id] = stok;
    }

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        setNama_makanan(id, nama);
        setHarga_makanan(id, harga);
        setStok(id, stok);
    }

    public void tampilMenuMakanan() {
        for (byte i = 0; i <= id; i++) {
            if (!isOutOfStock(i))
                System.out.println(getNama_makanan(i) + "[" + getStok(i) + "]" + "\t Rp." + getHarga_makanan(i));
        }
    }

    public boolean isOutOfStock(int ld) {
        if (stok[id] == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void nextId() {
        id++;
    }



    public void ordering(byte id, int jumlah) {
        if (stok[id] >= jumlah) {
            stok[id] -= jumlah;
        } else {
            System.out.println("Maaf, stok " + nama_makanan[id] + " tidak mencukupi");
        }
    }

    

}