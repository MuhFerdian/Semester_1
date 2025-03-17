/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.merahkuninghijau;

/**
 *
 * @author HALO YOGI
 */
import java.util.Scanner;
public class MerahKuningHijau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan warna lampu (merah, kuning, hijau): ");
        String warna = scanner.nextLine();

        switch (warna.toLowerCase()) {
            case "merah":
                System.out.println("Anda harus berhenti");
                break;
            case "kuning":
                System.out.println("Persiapan berhenti");
                break;
            case "hijau":
                System.out.println("Silahkan jalan");
                break;
            default:
                System.out.println("Warna salah");
        }
    }
}
