/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba3;

/**
 *
 * @author utoka
 */
public class Massiv {
    
    public void m1(){
        int[] a = new int[10];
        int i = 0;
        int b = 2;
        while (i < 10) {
            a[i] = b;
            b += 2;
            i++;
        }
        for (i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
            System.out.println();
        for (i = 0; i < 10; i++)
            System.out.println(a[i]);
    }
    
    public void m2(){
        int[] a = new int[50];
        int i = 0;
        int b = 1;
        while (i < 50) {
            a[i] = b;
            b += 2;
            i++;
        }
        for (i = 0; i < 50; i++)
            System.out.print(a[i] + " ");
            System.out.println();
        for (i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
    }
    
    public void m3(){
        int[] a = new int[15];
        int b = 0;
        for(int i = 0; i < 15; i++){
            a[i] = (int) Math.round(Math.random() * 9);
		System.out.print(a[i] + " ");
            if (a[i] % 2 == 0)
		b++;
        }
        System.out.println("\nКоличество четных элементов: " + b);
    }
    
    public void m4(){
        int[][] a = new int[8][5];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = (int)(Math.random()*90)+10;
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    public void m5(){
        int[][] a = new int[7][4];
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++){
            System.out.print("Строка №" + (i + 1) + " ");
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = (int)(Math.random()*11)-5;
                System.out.print(a[i][j] + " ");
                if(j==0)
                    b[i] = a[i][j];
                else 
                    b[i] *= a[i][j];
            }
            System.out.println(" ");
        }
        int max = 0, maxi = 0;
        for(int i = 0; i < b.length; i++){
            if(Math.abs(b[i]) > max){
                max = b[i];
                maxi = i + 1;
            }
        }
        System.out.println("Строка с наибольшим по модулю произведением элементов(" + max + ") имеет индекс - " + maxi);
    }
    
}
