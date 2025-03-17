/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluasibilangan;

/**
 *
 * @author HALO YOGI
 */
public class EvaluasiBilangan {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;

        // Hitung h1
        int h1 = (n1 + n2) * (n2 + n1);

        // Hitung h2
        int h2 = (n1 % 4) * n2;

        // Tampilkan hasil
        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);
    }
    
}
