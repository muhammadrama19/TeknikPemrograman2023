public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa muhRama = new Mahasiswa("Muhammad Rama", Jurusan.STEI_KOMPUTASI);
        Mahasiswa hGranger = new Mahasiswa("Hermione Granger", Jurusan.SAPPK);
        
        System.out.println(muhRama.getNama() + " berasal dari fakultas/sekolah: " + muhRama.getJurusan().getnama());
        System.out.println(hGranger.getNama() + " berasal dari fakultas/sekolah: " + hGranger.getJurusan().getnama());
    }
}