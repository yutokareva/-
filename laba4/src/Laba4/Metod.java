/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laba4;

import java.util.Random;

/**
 *
 * @author utoka
 */
public class Metod {
    
    public void z1(){
        int[] arr = new int[20];
        int a = 7;
        int b = 13;
        
        for(int i=0; i<arr.length; ++i){
            arr[i] = gR(a, b);
            System.out.print(arr[i]+"  ");
        }
    }
        
    public int gR(int a, int b){
        return (a + new Random().nextInt(b-a+1));
    }
    
    public void z2(){
    int[] Mas1=new int[10];
        zapolnenieMassiva(Mas1);
        pT(Mas1);
        
        int[] Mas2=new int[10];
        zapolnenieMassiva(Mas2);
        pT(Mas2);
        
        int[] Mas3=new int[10];
        zapolnenieMassiva(Mas3);
        pT(Mas3);
        
        int[] Mas4=new int[10];
        zapolnenieMassiva(Mas4);
        pT(Mas4);
         
        int[] Mas5=new int[10];
        zapolnenieMassiva(Mas5);
        pT(Mas5);
    }
    
     public static int rT(int a,int b){
        if(a>b){
            int c=(int)(Math.random()*(a-b+1))+b;
            return c;
        }
        else {
            int c=(int)(Math.random()*(b-a+1))+a;
            return c;
        }
    }
     
    public static int [] zapolnenieMassiva(int [] a){
        int z = (int)(Math.random()*100);
        int x = (int)(Math.random()*100);
        for(int i=0;i<a.length;i++){
            a[i]=rT(z, x);
            }
        return a;
    }
    
    public static void pT(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if(i==a.length-1)
                System.out.println("");
        }
    }
    
    public void z3(){
        int[] vot={13,4,5,6,12,2,3};
        int i,j;
        for (i=vot.length- 1;i >= 0;i--) {
          
            for (j=0;j<i;j++) {
                if (vot[j]<vot[j+1]) {
                    int temp=vot[j];
                    vot[j]=vot[j+1];
                    vot[j+1]=temp;
                   
                }
            }
           
            System.out.print (vot[i]+" ");
        }   
    }
    
    
}
    
