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
public class Balok {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t = input.nextInt();
        
        int luasPermukaan = 2 * ((p * l) + (p * t) + (l * t));
        System.out.println("Luas permukaan Balok adalah: " + luasPermukaan);
        
        int volume = p * l * t;
        System.out.println("Volume Balok adalah: " + volume);
    }
}

static int hitungLuasPermukaan(int p, int l, int t){
        int hasil = 2 * ((p * l) + (p * t) + (l * t));
        return hasil;
    }
    static int hitungVolume(int p, int l, int t){
        int hasil = p * l * t;
        return hasil;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t = input.nextInt();
        System.out.println("Luas permukaan Balok adalah: " + hitungLuasPermukaan(p, l, t));
        System.out.println("Volume Balok adalah: " + hitungVolume(p, l, t));
}