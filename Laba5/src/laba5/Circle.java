/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba5;

import java.util.Scanner;

/**
 *
 * @author utoka
 */
public class Circle {
    double x;
    double y;
    double r;
    public Circle() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Введите x: ");
                this.x = sc.nextDouble();
                System.out.print("Введите y: ");
                this.y = sc.nextDouble(); 
                System.out.print("Введите r: ");
                this.r = sc.nextDouble(); 
            break;    
            }
            catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }
    
    public void get() {
        System.out.println("x="+x+"; y="+y+"; r="+r);
    }
    
    public double CircleD() {
        return Math.floor(2 * Math.PI * this.r);
    }
    
    public void centr() {
        x = (Math.floor(Math.random()*198)-99);
        y = (Math.floor(Math.random()*198)-99);
        System.out.println("["+x+";"+y+"]");
    }
    
    public static double dis(Circle o1, Circle o2){
       double a = (o2.x - o1.x);
       double b = (o2.y - o1.y); 
       return Math.sqrt(a*a+b*b);
    }
    
    public static boolean touch(Circle o1, Circle o2){
        double dist = dis(o1, o2);
        if ((dist>o1.r) && (dist>o2.r)) {
            if (dist-(o1.r+o2.r)==0)
                return false;
            else return true;     
        }else{
            if (o1.r>o2.r){
                if(o1.r-(o2.r+dist)==0)
                    return true;
                else return false;
            }else{
                if(o2.r-(o1.r+dist)==0)
                    return true;
                else return false;
            }            
        }    
    }
    public static void main(String[] args) {
        Circle o1 = new Circle();
        System.out.print("Координаты центра и радиус первой окружности: ");
        o1.get();
        double length = o1.CircleD();
        System.out.println("Длина окружности:"+length);
        System.out.print("Новый центр окружности:");
        o1.centr();
        Circle o2 = new Circle();
        System.out.print("Координаты центра и радиус второй окружности: "); 
        o2.get();
        double dist = dis(o1, o2);
        System.out.println("Расстояние между центрами двух окружностей:"+dist);
        if (touch(o1, o2)) 
            System.out.println("Окружности касаются");
        else
            System.out.println("Окружности не касаются");
    } 
    
}
