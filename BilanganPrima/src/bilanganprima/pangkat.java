/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bilanganprima;

import java.util.Scanner;
public class pangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan 1  dasar (base): ");
        double base = scanner.nextDouble();
        System.out.print("Masukkan bilangan pangkat (exponent): ");
        int exponent = scanner.nextInt();
        // Menghitung hasil pangkat
        double hasil = hitungPangkat(base, exponent);
        // Menampilkan hasil
        System.out.println(base + " pangkat " + exponent + " adalah " + hasil);
        scanner.close();
    }
    // Fungsi untuk menghitung perpangkatan
    public static double hitungPangkat(double base, int exponent) {
        double result = 1;
        if (exponent == 0) {
            return 1; // Basis pangkat 0 selalu 1
        } else if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        } else { // exponent < 0
            for (int i = 0; i < -exponent; i++) {
                result *= base;
            }
            result = 1 / result; // Pangkat negatif
        }
        return result;
    }
}