import java.util.Scanner;
public class Percabanganif {

    public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    
        int angka;

            System.out.println("Masukkan angka: "); 
            angka = input.nextInt();

        if (angka > 75) 
            System.out.println("Selamat anda dinyatakan diterima");
        
    }
}