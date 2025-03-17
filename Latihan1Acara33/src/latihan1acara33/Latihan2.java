/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1acara33;

import java.util.Scanner;
public class Latihan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bilangan yang ingin dihitung: ");
        int bilangan = input.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = input.nextInt();

        System.out.println(hitungPangkat(bilangan,pangkat));
    }
}

