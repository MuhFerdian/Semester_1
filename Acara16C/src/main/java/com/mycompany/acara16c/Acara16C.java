/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.acara16c;

/**
 *
 * @author HALO YOGI
 */
public class Acara16C {
    int price;
    int pages;

    public static void main(String[] args) {
           Acara16C javabook = new Acara16C();
            javabook.set(600000, 100);
            javabook.show();
//        System.out.println("Hello World!");
    }
    public void set (int price, int pages){
        this.price = price;
        this.pages = pages;
    }
    public void show(){
        System.out.println("books information");
        System.out.println("books prices :" +price);
        System.out.println("number of pages :" +pages);
    }
   
}
