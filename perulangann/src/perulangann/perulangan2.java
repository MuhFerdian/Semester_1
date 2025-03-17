/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perulangann;
import javax.swing.*;
public class perulangan2 {

    public static void main(String[] args) {
        int i = 0, jumGenap = 0, jumGanjil = 0;
        boolean ulang = true;

        // Do-while loop to ensure at least one iteration
        do {
            String data_n = JOptionPane.showInputDialog("Masukkan bilangan");
            int N = Integer.parseInt(data_n);

            if (N > 0) {
                // Check if N is even or odd
                if (N % 2 == 0) {
                    jumGenap++;
                } else {
                    jumGanjil++;
                }

                i++; // Increment iteration counter
                System.out.println("Banyaknya bilangan genap sampai iterasi ke " + i + " = " + jumGenap);
                System.out.println("Banyaknya bilangan ganjil sampai iterasi ke " + i + " = " + jumGanjil);
            } else {
                ulang = false; // Exit the loop if N is negative or zero
            }
        } while (ulang);

        System.out.println("Perulangan selesai");
    }
}