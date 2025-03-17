/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fungsi1;

import java.util.Scanner;

/**
 *
 * @author HALO YOGI
 */
public class Hitung {
    
    static int kali(int angka1, int angka2) {
        int hasil = (angka1 + 10) % (angka2 + 19);
        return hasil;
    }
    static int kurang(int angka1, int angka2) {
        angka1 = angka1 + 7;
        angka2 = angka2 + 4;
        int hasil = kali(angka1, angka2);
        return hasil;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai 1: ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2: ");
        int nilai2 = input.nextInt();
        int hasil = kurang(nilai1, nilai2);
        System.out.println("Hasil akhir adalah " + hasil);
    }
}
