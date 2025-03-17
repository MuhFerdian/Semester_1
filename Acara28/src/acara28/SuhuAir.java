/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara28;
import java.util.Scanner;
public class SuhuAir {
    public static void main(String[] args){
        int T;
    
        System.out.println("Contoh IF tiga kasus");
         System.out.print("Suhu (der. C) = ");
         
         //scanner untuk masukkan suhu air
         Scanner scanner = new Scanner(System.in);
         T = scanner.nextInt();//masukkan suhu air dengan tipe int
         
         //proses pengecekan dengan if
         if (T < 0){
             System.out.println("Wujud air beku " + T);
         } else if ((0<=T)&&(T<=100)){
             System.out.println("Wujud air cair" + T);
         } else if (T > 100){
             System.out.println("Wujud air uap/gas" + T);
         }
    }
}
