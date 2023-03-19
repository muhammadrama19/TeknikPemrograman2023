public enum Jurusan{
    STEI_KOMPUTASI("STEI KOMPUTASI"),
    SAPPK("SAPPK"),
    FTMD("FTMD"),
    SITH_REKAYASA("SITH REKAYASA"),
    SBM("SBM"),
    FTI("FTI");
    
    private String nama;
    
    private Jurusan(String nama) {
        this.nama = nama;
    }
    
    public String getnama() {
        return nama;
    }
}
