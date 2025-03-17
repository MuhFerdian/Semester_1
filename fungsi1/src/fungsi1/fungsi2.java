/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fungsi1;

/**
 *
 * @author HALO YOGI
 */
public class fungsi2 {
    static void beriSalam() {
        System.out.println("Halo! Selamat Pagi");
    }
    static void beriUcapan(String ucapan) {
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        beriSalam();
        String salam = "Selamat datang di pemrograman Java";
        beriUcapan(salam);
    }
}