/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator_sederhana;

/**
 *
 * @author HALO YOGI
 */
import java.util.Scanner;
public class Menampilakan6bilanga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bilangan = new int[6]; 
        
        System.out.println("Masukkan 6 bilangan: ");

        // Memasukkan bilangan ke dalam array
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Bilangan ke-" + (i+1) + ": ");
            bilangan[i] = scanner.nextInt();
        }

        // Menampilkan bilangan yang telah dimasukkan
        System.out.println("Bilangan yang dimasukkan adalah:");
        for (int bilanganSaatIni : bilangan) {
            System.out.println(bilanganSaatIni + " ");
        }
    }
}

