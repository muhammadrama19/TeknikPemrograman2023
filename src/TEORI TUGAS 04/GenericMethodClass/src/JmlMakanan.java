import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JmlMakanan {
    public static void main(String[] args) {
        List<Makanan<Integer, Integer>> makanan = new ArrayList<>();
        makanan.add(new Makanan<>(10, 2));
        makanan.add(new Makanan<>(5, 3));
        makanan.add(new Makanan<>(8, 1));
        double jmlTotal = hitungjmlTotal(makanan);
        System.out.println("Total belanja anda adalah: " + jmlTotal); 
    }
    
    public static <T extends Number, U extends Number> double hitungjmlTotal(List<Makanan<T, U>> makanan) {
        double jmlTotal = 0.0;
        for (Makanan<T, U> product : makanan) {
            double harga = product.getharga().doubleValue();
            double jumlah = product.getjumlah().doubleValue();
            jmlTotal += harga * jumlah;
        }
        return jmlTotal;
    }
}

class Makanan<T extends Number, U extends Number> {
    private T harga;
    private U jumlah;
    
    public Makanan(T harga, U jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    public T getharga() {
        return harga;
    }
    
    public U getjumlah() {
        return jumlah;
    }
}
