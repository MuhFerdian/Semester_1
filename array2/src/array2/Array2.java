/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2;
import java.util.Scanner;
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk=new Scanner (System.in);
        System.out.print("Jumlah Mahasiswa : ");
        int n=masuk.nextInt();
        String mahasiswa[][] = new String[n][3];
        for(int i= 0; i<n; i++) {
            System.out.println("");
            System.out.println("Data Mahasiswa ke "+(i+1));
            for(int j=0;j<3;j++) {
                if (j == 0) System.out.print("NIM : ");
                else if (j == 1) System.out.print("Nama : ");
                else System.out.print("Jurusan : ");
                System.out.print("");
                mahasiswa[i][j] = masuk.next();
            }
        }
        System.out.println("Data Mahasiswa yang dimasukkan");
        System.out.println("------------------------------");
        System.out.println("NIM /t/t/t NAMA /t/t JURUSAN /t");
        for(int i=0;1<n;i++) { for(int j=0;j<3;j++){
            System.out.print(mahasiswa[i][j]+"/t/t");
        }
        System.out.println();
        }
    }
}
                
