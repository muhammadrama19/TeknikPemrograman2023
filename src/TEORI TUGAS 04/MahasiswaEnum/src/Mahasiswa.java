public class Mahasiswa {
    private String Nama;
    private Jurusan Jurusan;
    
    public Mahasiswa(String Nama, Jurusan Jurusan) {
        this.Nama = Nama;
        this.Jurusan = Jurusan;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public Jurusan getJurusan() {
        return Jurusan;
    }
    
    public void setJurusan(Jurusan Jurusan) {
        this.Jurusan = Jurusan;
    }
}


