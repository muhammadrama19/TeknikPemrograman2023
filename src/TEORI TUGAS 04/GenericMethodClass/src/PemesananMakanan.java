public class PemesananMakanan{
    public static void main(String[] args) {
        
        Baso basoUrat = new Baso("BasoUrat", 12.99);
        Seblak seblakPedas = new Seblak("SeblakPedas", 8.99);
        Nasgor NasgorKambing = new Nasgor("NasgorKambingr", 7.99);
        
        Order<Baso> BasoOrder = new Order<>(basoUrat, 2, 25.98);
        Order<Seblak> SeblakOrder = new Order<>(seblakPedas, 1, 8.99);
        Order<Nasgor> NasgorOrder = new Order<>(NasgorKambing, 3, 23.97);

        System.out.println(BasoOrder.getjmlh() + " Porsi " + BasoOrder.getItemMakanan().getNama() + " Seharga: " + BasoOrder.getTotalHarga());
        System.out.println(SeblakOrder.getjmlh() + " Porsi " + SeblakOrder.getItemMakanan().getNama() + " Seharga: " + SeblakOrder.getTotalHarga());
        System.out.println(NasgorOrder.getjmlh() + " Porsi " + NasgorOrder.getItemMakanan().getNama() + " Seharga: " + NasgorOrder.getTotalHarga());
    }
}

class ItemMakanan {
    private String Nama;
    private double Harga;
    
    public ItemMakanan(String Nama, double Harga) {
        this.Nama = Nama;
        this.Harga = Harga;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public double getHarga() {
        return Harga;
    }
}

class Baso extends ItemMakanan {
    public Baso(String Nama, double Harga) {
        super(Nama, Harga);
    }
}

class Seblak extends ItemMakanan {
    public Seblak(String Nama, double Harga) {
        super(Nama, Harga);
    }
}

class Nasgor extends ItemMakanan {
    public Nasgor(String Nama, double Harga) {
        super(Nama, Harga);
    }
}

class Order<T> {
    private T ItemMakanan;
    private int jmlh;
    private double totalHarga;
    
    public Order(T ItemMakanan, int jmlh, double totalHarga) {
        this.ItemMakanan = ItemMakanan;
        this.jmlh = jmlh;
        this.totalHarga = totalHarga;
    }
    
    public T getItemMakanan() {
        return ItemMakanan;
    }
    
    public void setItemMakanan(T ItemMakanan) {
        this.ItemMakanan = ItemMakanan;
    }
    
    public int getjmlh() {
        return jmlh;
    }
    
    public void setjmlh(int jmlh) {
        this.jmlh = jmlh;
    }
    
    public double getTotalHarga() {
        return totalHarga;
    }
    
    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
}
