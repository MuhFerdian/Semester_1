/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fungsi1;

/**
 *
 * @author HALO YOGI
 */
public class Persegi {
    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }
    public static void main(String[] args) {
        int luasan = luasPersegi(5);
        System.out.println("Luas Persegi dengan sisi 5 = " +
                luasan);
    }
}
