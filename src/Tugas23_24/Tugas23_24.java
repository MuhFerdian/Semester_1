package Tugas23_24;
import java.util.Scanner;
/**
 *
 * @author Ferdian
 */
public class Tugas23_24 {
    
    public static void main(String[] args) {
        long bilangan = 15L; // nilai bilangan maksiamal
        long faktorial = 1L; // variable untuk menyimpan faktorial
        // looping untuk menacari faktorial pada bilangan
        for (long i = 1L; i <= bilangan; i++)
        {    faktorial = 1L; // inisialisasi faktorial
        // menghitung nilai faktorial
        for (long faktor = 2; faktor <= i; faktor++) {
            faktorial *= faktor;
        }
        System.out.println("Faktorial dari "+i + " adalah " + faktorial); 
        
        }
    }
    
}
