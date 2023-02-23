/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.method;

/**
 *
 * @author User
 */
public class Metodusgyak {
    public static void main(String[] args){
        String kimenet = "Az első 10 szám összege: " + elso10SzamOsszege();
        kiir(kimenet);
        
        int szam1 = 8, szam2 = 3, szam3 = 2, szam4 = 11;
        kiir("%d + %d = %d\n".formatted(szam1, szam2, osszead(szam1, szam2)));
        kiir("%d + %d + %d+ %d = %d\n".formatted(szam1, szam2, szam3, szam4, osszead(osszead(szam1, szam2),osszead(szam3, szam4))));
    }   
    
    
    private static int elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        return osszeg;
        }
    }
    
    private static int osszead(int a, int b){
        return a+b;
        }
    }
    
    
    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
}
