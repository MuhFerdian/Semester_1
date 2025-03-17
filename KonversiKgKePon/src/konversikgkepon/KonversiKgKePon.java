/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversikgkepon;

/**
 *
 * @author HALO YOGI
 */
public class KonversiKgKePon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int konversi = 2;
        for (int kg = 1; kg <= 100; kg++){
            int pon = kg * konversi;
            System.out.println(kg + " kg = " + pon + " pon ");
        }
    }
    
}
