/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1acara33;

/**
 *
 * @author HALO YOGI
 */
public class Latihan1Acara33 {
// Fungsi faktorial rekursif
    static int faktorialRekursif(int n) {
        
        if (n == 0) {
            return 1;
        } else {
            return n * faktorialRekursif(n - 1);
        }
    }
    
    // Fungsi faktorial iteratif
    static int faktorialIteratif(int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor *= i;
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialIteratif(5));
    }
    
}
