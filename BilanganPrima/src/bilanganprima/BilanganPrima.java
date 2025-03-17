/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilanganprima;

import java.util.*;

public class BilanganPrima {
  public static void main(String[] args) {
    int bil,i,faktor;

    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan bilangan : ");
    bil = input.nextInt();
    
    faktor = 0;
    
    for (i = 1; i <= bil; i++) {
      if (bil % i == 0) {
         faktor=faktor+1;
      }
    }
   
    if (faktor == 2) {
      System.out.println(Integer.toString(bil) + " Merupakan bilangan prima");
    } else {
      System.out.println(Integer.toString(bil) + " Bukan Merupakan bilangan prima");
    }
  }
}