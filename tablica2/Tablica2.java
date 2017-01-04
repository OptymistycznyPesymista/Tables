/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablica2;

import java.util.Random;

/**
 *
 * @author Nikodem
 */
public class Tablica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10, a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza się w tablicy
    
        int tab[]=new int[20];
        Random r= new Random ();
        int i;
        System.out.println(" Wylosowane liczby to: "); 
        for (i=0; i<tab.length; i++){
            tab[i]=r.nextInt(10)+1;
        System.out.print(tab[i] + " ");}
       int a=0; int b=0; int c=0; int d=0;  int e=0; int f=0; int g=0; int h=0; int j=0; int k=0;
        
        for (i=0; i<tab.length;i++){
        if (tab[i]==1){
        
        a++;}
    
        if (tab[i]==2){
        
        b++;}
        
        if (tab[i]==3){
        
        c++;}
        
        if (tab[i]==4){
        
        d++;}
        
        
        if (tab[i]==5){
       
        e++;}
        
        if (tab[i]==6){
        
        f++;}
        
        if (tab[i]==7){
        
        g++;}
        
        if (tab[i]==8){
        
        h++;}
        
        if (tab[i]==9){
        
        j++;}
        
        if (tab[i]==10){
        
        k++;}
        }
            System.out.println(" ");
            System.out.println("1 - " + a);
            System.out.println("2 - " + b); 
            System.out.println("3 - " + c);
            System.out.println("4 - " + d);
            System.out.println("5 - " + e);
            System.out.println("6 - " + f);
            System.out.println("7 - " + g);
            System.out.println("8 - " + h);
            System.out.println("9 - " + j);
            System.out.println("10 - " + k);
    }
}

