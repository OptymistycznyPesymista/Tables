/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablica1;

import java.util.Random;

/**
 *
 * @author Nikodem
 */
public class Tablica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // utworzenie  i wypisanie tablicy 10 liczbami wylosowanymi z przedziału [-10,...,10] 
        int tab [] = new int [10];
        Random r = new Random ();
        int i;
        System.out.println(" Wylosowane liczby to: ");    
            for ( i=0; i<tab.length; i++){

                tab[i]=r.nextInt(21)+ -10;     
               System.out.print(tab[i] + " ");}
     
                        // wypisanie najwiekszej wartości w tablicy

                        int max = 0;
                        
                        
                        for(i=1; i<tab.length; i++){
                        if (tab[i]>max){
                            max=tab[i];
                            }}
                        System.out.println(" ");
                        System.out.println("Największa wartość w tablicy wynosi: " + max);
                        
                        
                                // wypisanie najmniejszej wartości w tablicy

                                int min=0;

                                for(i=1; i<tab.length;i++){
                                    if (tab[i]<min){
                                        min=tab[i];}}
                                 
                                System.out.println("Najmniejsza wartość w tablicy wynosi: " + min);                          
    
                                                        
                                                        // wypisanie średniej arytmetycznej wartości w tablicy

                                                        double suma=0;
                                                        for(i=0; i<tab.length;i++){
                                                        suma=suma+tab[i];}

                                                        double srednia=suma/tab.length;
                                                        System.out.println(" Srednia wartosci w tablicy wynosi: " + srednia);
    
                                                                                        


                                                                                       // wyznaczanie ile elementów jest mniejszych, a ile większych od średniej
                                                                                        int wieksze=0;
                                                                                        int mniejsze=0;
                                                                                        for (i=0;i<tab.length;i++){
                                                                                            if(tab[i]>srednia){
                                                                                                wieksze++;}
                                                                                            else
                                                                                                mniejsze++;}
                                                                                        System.out.println(" Wartosci wiekszych od sredniej jest: " + wieksze);
                                                                                        System.out.println(" Wartosci mniejszych od sredniej jest: " + mniejsze);
    
                                                                                                                                                        


                                                                                                                                                        // wypisanie wartości tablicy w odwrotnej kolejności
                                                                                                                                                        System.out.print(" Liczby w odwrotnej kolejności to: ");
                                                                                                                                                        for (i=9;i>=0;i--){
                                                                                                                                                            System.out.print(tab[i]+ " ");}

    
    
    
                                                                                                                                                                    }


                                                                                                                                                                    }
                        

            
            
            

            
    


