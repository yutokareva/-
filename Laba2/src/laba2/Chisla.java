/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author utoka
 */
public class Chisla {

    /**
     *
     */
    public void ch() throws IOException, IOException{
        for (int i = 2; i < 101; i = i+2) {
        System.out.print(i + " ");
        }
    }
    
    public void pr() throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int j = 0; j < m; j++)
        {
          for (int i = 0; i < n; i++)
        {
            System.out.print ("8");
        }
            System.out.print (""+"\n");
        }
    }
    
    public void tr(){
        String s = "8";
        for (int count = 0; count < 10; count++){
            System.out.println(s);
            s = s + 8;
        }
    }
    
    public void mini() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if(a < b) 
            System.out.println("Число a = " + a + " минимальное");
        else 
            System.out.println("Число b = " + b + " минимальное");
    } 
    
    public void str() throws IOException{
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    String nameOne = r.readLine();
    String nameTwo = r.readLine();
    String q = compare(nameOne, nameTwo);
    System.out.println(q);
    }
    
    public String compare(String a, String b){
        String q1 = null;
    if (a.length() == b.length()){   
        q1 = "Длины имен равны";
    }
    if (a.equals(b)){
        System.out.println("Имена идентичны");
    }       
    return q1;
    }
    
    public void minimum() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int m = min(a, b, c, d);
        System.out.println("Минимальное число: "+m);
    }
    
    public int min(int a, int b, int c, int d){
        int m;
            if (c < a)
                if (d < c)
                    m = d;
                else
                    m = c;
                else
                    m = min(a, b);
            return m; 
    }
    
    public int min(int a, int b){
        int m;
            if (a < b)
                m = a;
            else
                m = b;
            return m;
    }
    
    public void chetv() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a > 0 && b > 0) System.out.println("Данная точка находится в первой четверти");
            else if (a < 0 && b > 0) 
                System.out.println("Данная точка находится во второй четверти");
            else if (a < 0 && b < 0) 
                System.out.println("Данная точка находится в третьей четверти");
            else if (a > 0 && b < 0) 
                System.out.println("Данная точка находится в четвертой четверти");    
    }
    
}
