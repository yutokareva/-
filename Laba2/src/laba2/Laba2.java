/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2;

import java.io.IOException;

/**
 *
 * @author utoka
 */
public class Laba2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Chisla ourcat = new Chisla();
        System.out.println("Задание 1:");
        ourcat.ch();
        System.out.println("\nЗадание 2:");
        ourcat.pr();
        System.out.println("Задание 3:");
        ourcat.tr();
        System.out.println("Задание 4:");
        ourcat.mini();
        System.out.println("Задание 5:");
        ourcat.str();
        System.out.println("Задание 6:");
        ourcat.minimum();
        System.out.println("Задание 7:");
        ourcat.chetv();
    }
    
}
