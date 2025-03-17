/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayinputloop;
import java.util.Scanner;
public class ArrayInputLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
                int nilaiUAS[]= new int[6];
                        for(int i=0; i<nilaiUAS.length; i++){
                            System.out.print("Masukkan nilai UAS ke-"+i+": ");
                            nilaiUAS[i]=sc.nextInt();
                        }
                        for(int i=0; i<nilaiUAS.length; i++){
                            if(nilaiUAS[i] >= 70){
                                System.out.println("Mahasiswa ke-"+i+"lulus");
    }
}

                        
    }
    
}
