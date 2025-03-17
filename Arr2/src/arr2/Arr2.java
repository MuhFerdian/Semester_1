/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arr2;

/**
 *
 * @author HALO YOGI
 */
public class Arr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]nilai=new int[2][4];
        
        nilai[0][0]=12;
        nilai[0][1]=14;
        nilai[0][2]=34;
        nilai[0][3]=19;
        nilai[1][0]=30;
        nilai[1][1]=21;
        nilai[1][2]=67;
        nilai[1][3]=19;
        
        for (int array1D[]: nilai){
            for(int j : array1D){
                System.out.print(j+" "); 
            }
            System.out.println(" ");
        }
    }
    
}
