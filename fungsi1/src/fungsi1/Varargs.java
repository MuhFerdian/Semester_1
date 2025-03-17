/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fungsi1;

/**
 *
 * @author HALO YOGI
 */
public class Varargs {
    
}
static void tampil(String pesan, int... angka){
System.out.println("String: " + pesan);
System.out.println("Jumlah argumen/parameter: " + angka.length);

for (int i = 0; i < angka.length; i++){
System.out.print(angka[1] + " ");
}
System.out.println();
}
public static void main(String[] args) {
tampil("Daspro 2019", 100, 200);
tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
tampil("Polinema");
int[] angka = {1, 2, 3, 4};
tampil("Malang", angka);
}
