/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HALO YOGI
 */
public class Palindrom {
    public boolean isPalindrom(String str) {
        return isPalindromRecc(0, str.length() - 1, str);
    }
    public boolean isPalindromRecc(int first, int last, String str) {
        if (first >= last) {
            return true;
        }
        char firstChar = str.charAt(first);
        char lastChar = str.charAt(last);
        if (Character.toLowerCase(firstChar) != Character.toLowerCase(lastChar)) {
            return false;
        }
        return isPalindromRecc(first + 1, last - 1, str);
    }
    public static void main(String[] args) {
        Palindrom pal = new Palindrom();
        String[] tests = {"KATAK", "MALAM", "HELLO", "ADA", "A", ""};
        for (String test : tests) {
            boolean isPal = pal.isPalindrom(test);
            System.out.println("\"" + test + "\" adalah palindrom: " + isPal);
        }
    }
}