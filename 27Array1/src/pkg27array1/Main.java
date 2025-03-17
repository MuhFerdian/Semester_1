/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg27array1;

/**
 *
 * @author HALO YOGI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        // Deklarasi array
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] KOTA = {
                {'B', 'A', 'N', 'T', 'E', 'N'},
                {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
                {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                {'B', 'O', 'G', 'O', 'R'},
                {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                {'M', 'A', 'L', 'A', 'N', 'G'},
                {'T', 'E', 'G', 'A', 'L'}};

        // Menampilkan isi array
        System.out.println("Kode    Kota");
        for (int i = 0; i < KODE.length; i++) {
            System.out.print(KODE[i]+"      ");
            for (int j = 0; j < KOTA[i].length; j++) {
                System.out.print(KOTA[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}