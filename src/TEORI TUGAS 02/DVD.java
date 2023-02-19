import java.util.*;
// Parent class
abstract class DVD {
    protected String judul;
    protected String publisher;
    protected String kategori;
    protected int stock;
    

    public DVD(String judul, String publisher, String kategori, int stock) {
        this.judul = judul;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stock = stock;
    }

    // Abstract method to be implemented by child classes
    public abstract void display();

    // Getters and setters
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

// Child class 1 - Film DVD
class FilmDVD extends DVD {
    private String[] pemeran;
    private String sutradara;

    public FilmDVD(String judul, String pemeran, String sutradara, String publisher, String kategori, int stock) {
        super(judul, publisher, kategori, stock);
        this.pemeran = pemeran.split(", ");
        this.sutradara = sutradara;
    }

    // Override the abstract display method from parent class
    @Override
    public void display() {
        System.out.println("Judul: " + getJudul());
        System.out.println("Pemeran: " + String.join(", ", getPemeran()));
        System.out.println("Sutradara: " + getSutradara());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Kategori: " + getKategoriName());
        System.out.println("Stock: " + getStock());
        System.out.println();
    }

    // Getters and setters
    public String[] getPemeran() {
        return pemeran;
    }

    public void setPemeran(String[] pemeran) {
        this.pemeran = pemeran;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getKategoriName() {
        switch (getKategori()) {
            case "SU":
                return "Semua Umur";
            case "D":
                return "Dewasa";
            case "R":
                return "Remaja";
            case "A":
                return "Anak-anak";
            default:
                return "Unknown";
        }
    }
}

class MusicDVD extends DVD {
    private String penyanyi;
    private String produser;
    private String[] topHits;

    public MusicDVD(String judul, String penyanyi, String produser, String publisher, String topHits, String kategori, int stock) {
        super(judul, publisher, kategori, stock);
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.topHits = topHits.split(",");
    }

    // Override the abstract display method from parent class
    @Override
    public void display() {
        System.out.println("Judul: " + getJudul());
        System.out.println("Penyanyi: " + getPenyanyi());
        System.out.println("Produser: " + getProduser());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Top Hits: " + String.join(", ", getTopHits()));
        System.out.println("Kategori: " + getKategoriName());
        System.out.println("Stock: " + getStock());
        System.out.println();
    }

    // Getters and setters
    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public String getProduser() {
        return produser;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public String[] getTopHits() {
        return topHits;
    }

    public void setTopHits(String[] topHits) {
        this.topHits = topHits;
    }

    public String getKategoriName() {
        switch (getKategori()) {
            case "C":
                return "Classic";
            case "J":
                return "Jazz";
            case "P":
                return "Pop";
            case "R":
                return "Rock";
            case "O":
                return "Other";
            default:
                return "Unknown";
        }
    }
}