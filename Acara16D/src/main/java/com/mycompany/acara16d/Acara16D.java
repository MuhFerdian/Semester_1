
package inputankeyboard;

import java.util.Scanner;

public class Inputankeyboard {
    
      public static void main(String[] args) {
//buat scanner
       Scanner s1 = new Scanner(System.in);
       
//Ambil nilai dari keyboard
       System.out.print("Masukkan nilai1 = ");
       int nilai1 = s1.nextInt();
       System.out.print("Masukkan nilai2 = ");
       int nilai2 = s1.nextInt();
       
//Hitung dan Print
       int jumlah = nilai1 + nilai2;
       System.out.println("Jumlah = " + jumlah);
   }
}