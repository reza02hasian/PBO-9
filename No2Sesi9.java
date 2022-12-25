package PBO9;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class No2Sesi9 {
     public static void main(String[] args) {
         
    // Membuat objek ArrayList untuk menyimpan data string
    ArrayList<String> arrayList = new ArrayList<>();

    // Menambahkan beberapa elemen ke ArrayList
    arrayList.add("Selamat");
    arrayList.add("Datang");
    arrayList.add("di Bandung");

    // Menampilkan elemen ArrayList menggunakan loop for
    for (String str : arrayList) {
      System.out.println(str);
    }

    // Membuat objek ArrayDeque untuk menyimpan data integer
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

    // Menambahkan beberapa elemen ke ArrayDeque
    arrayDeque.add(80);
    arrayDeque.add(100);
    arrayDeque.add(90);

    // Menampilkan elemen ArrayDeque menggunakan iterator
    for (int num : arrayDeque) {
      System.out.println(num);
    }
  }
}
