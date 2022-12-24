
package ArrayDeque;

import java.util.ArrayDeque;

public class contohArrayDeque{
    public static void main(String[] args) {
        ArrayDeque<Integer> Angka = new ArrayDeque<>();
        Angka.add(15);
        Angka.addFirst(5);
        Angka.addLast(30);
 
        System.out.println("----------------------");
        System.out.println(Angka);
        System.out.println("----------------------");
        System.out.println("Ambil angka terakhir");
        System.out.println( Angka.getLast());
        System.out.println("Menghapus data angka");
        System.out.println(Angka.pollFirst());
        System.out.println("sisa angka setelah dihapus");
        System.out.println(Angka);
        
    }
}