package Memperbaiki_Program;

public class Mahasiswa<MahaNim,MahaNama, MahaKelas> {
    private MahaNim nim;
    private MahaNama name;
    private MahaKelas kelas;
    
    public void setNim(MahaNim nim) {
        this.nim = nim;
    }
    
    public MahaNim getNim() {
        return nim;
    }
    
    public void setName(MahaNama name) {
        this.name = name;
    }
    
    public MahaNama getName() {
        return name;
    }
    
    public void setClass(MahaKelas kelas) {
        this.kelas = kelas;
    }
    
    public MahaKelas getKelas() {
        return kelas;
    }
}