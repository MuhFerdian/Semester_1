/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulangann;

import javax.swing.*;

public class Perulangann {

    public static void main(String[] args) {
        String data_N = JOptionPane.showInputDialog("Masukkan bilangan ");
        int N = Integer.parseInt(data_N);

        int faktorial = 1;
        for (int i = 1; i <= N; i++) {
            faktorial = faktorial * i;
        }
        System.out.println("Nilai " + N + "! = " + faktorial);
    }
}