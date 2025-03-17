/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perulanganfaktorial;

import java.util.Scanner;

public class PerulanganFaktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah tumpukan bilangan: ");
        int n = scanner.nextInt();
        
        int i = n;
        while (i > 0) {
            int j = n - i;
            while (j > 0) {
                System.out.print(" ");
                j--;
            }
            
            int k = i;
            while (k > 0) {
                System.out.print(i + " ");
                k--;
            }
            
            System.out.println();
            i--;
        }
    }
}