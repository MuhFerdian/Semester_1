/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HALO YOGI
 */
public class XY {
    public String changeXY(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char firstChar = str.charAt(0);
        if (firstChar == 'x') {
            return 'y' + changeXY(str.substring(1));
        } else {
            return firstChar + changeXY(str.substring(1));
        }
    }
    public static void main(String[] args) {
        XY changer = new XY(); 
        System.out.println(changer.changeXY("decodex")); 
        System.out.println(changer.changeXY("xyxy"));
    }
}