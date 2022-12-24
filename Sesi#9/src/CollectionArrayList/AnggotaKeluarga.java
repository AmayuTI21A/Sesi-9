
package CollectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AnggotaKeluarga {
  public static void main(String[] args) {
    ArrayList<String> Nama_Anggota = new ArrayList<>();
    //mengisi array
    Nama_Anggota.add("Sulaeman");
    Nama_Anggota.add("Imas");
    Nama_Anggota.add("Ninda");
    Nama_Anggota.add("Angga");
    Nama_Anggota.add("Sanu");
    Nama_Anggota.add("Diah");
    Nama_Anggota.add("Chandra");
    
    //Menghapus Array
    Nama_Anggota.remove("Angga");
    
    Iterator NA = Nama_Anggota.iterator();
    
    //untuk mengeluarkan data dalam array saya menggunakan while dengan metode iterator
    while(NA.hasNext()){
        System.out.println(NA.next()); 
    }
  }
}