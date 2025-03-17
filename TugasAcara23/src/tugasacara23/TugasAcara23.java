package tugasacara23;
import java.util.Scanner;
public class TugasAcara23 {

    public static void main(String[] args) {
        long bilangan = 15L; //Nilai bilangan maksimal
        long faktorial = 1L; //Variabel untuk menyimpan faktorial
        
        //Looping untuk mencari faktorial pada bilangan 
        for (long i = 1L; i <= bilangan; i++){
            faktorial = 1L; //inisialisasi faktorial
            
        //Menghitung nilai faktorial 
        for (long faktor = 2; faktor <= i; faktor++) {
            faktorial *= faktor;
        }
        System.out.println("Faktorial dari "+i + " adalah "     + faktorial);
        }
    }
    
}
