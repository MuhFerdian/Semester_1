/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator_sederhana;

/**
 *
 * @author Ferdian
 */
import java.util.Scanner;
public class Kalkulator_sederhana{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = scanner.nextInt();
        
        System.out.print("Pilih operasi (+, -, *, /): ");
        char operasi = scanner.next().charAt(0);

        int hasil = 0;
        boolean Hasil = true;

        // Melakukan operasi berdasarkan input pengguna
        switch (operasi) {
            case '+' -> hasil = bilangan1 + bilangan2;
            case '-' -> hasil = bilangan1 - bilangan2;
            case '*' -> hasil = bilangan1 * bilangan2;
            case '/' -> {
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Error");
                    Hasil = false;
                }
            }
            default -> System.out.println("Error");
        }
        // Menampilkan hasil jika operasi valid
        if (Hasil) {
            System.out.println("Hasil: " + hasil);
        }
    }
}
    
    

