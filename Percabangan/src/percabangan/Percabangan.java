package percabangan;

import java.util.Scanner;

public class Percabangan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan sebuah nilai : ");
        int nilai = input.nextInt();
        
        if (nilai>=100) {
            nilai+=10;
        }else {
            nilai-=10;
        }
        System.out.println("Hasil nilai akhir adalah" +nilai);
        }
    }
        