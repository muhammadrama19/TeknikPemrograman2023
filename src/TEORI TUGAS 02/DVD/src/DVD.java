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

    // abstract untuk di child class
    public abstract void display();

    // Getters and setters
    public String getJudul() {
        return judul;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getKategori() {
        return kategori;
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

    // Override the abstract display method dari parent 
    @Override
    public void display() {
        System.out.println("Judul: " + getJudul());
        System.out.println("Pemeran: " + String.join(", ", getPemeran()));
        System.out.println("Sutradara: " + getSutradara());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Kategori: " + getKategoriNameFilm());
        System.out.println("Stock: " + getStock());
        System.out.println();
    }

    // Getters and setters
    public String[] getPemeran() {
        return pemeran;
    }

    public String getSutradara() {
        return sutradara;
    }

    public String getKategoriNameFilm() {
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

    // Override the abstract display method dari parent
    @Override
    public void display() {
        System.out.println("Judul: " + getJudul());
        System.out.println("Penyanyi: " + getPenyanyi());
        System.out.println("Produser: " + getProduser());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Top Hits: " + String.join(", ", getTopHits()));
        System.out.println("Kategori: " + getKategoriNameMusic());
        System.out.println("Stock: " + getStock());
        System.out.println();
    }

  
    public String getPenyanyi() {
        return penyanyi;
    }
    public String getProduser() {
        return produser;
    }

    public String[] getTopHits() {
        return topHits;
    }

    public String getKategoriNameMusic() {
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