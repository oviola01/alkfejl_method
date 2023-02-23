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
        feladatok();
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
    
    private static void feladat_10szam() {
        String kimenet = "Az első 10 szám összege: " + elso10SzamOsszege();
        kiir(kimenet);
    }
    
    private static void feladat_sum2szam(int szam1, szam2) {
        kiir("%d + %d = %d\n".formatted(szam1, szam2, osszead(szam1, szam2)));
    }

    private static void feladat_sum4szam(int szam1, szam2, szam3 szam4) {
        kiir("%d + %d + %d+ %d = %d\n".formatted(szam1, szam2, szam3, szam4, osszead(osszead(szam1, szam2),osszead(szam3, szam4))));
    }
    
    private static void feladat_gyok3szam(int szam1, szam2, szam3) {
        int osszegem = osszead(osszead(szam1, szam2), szam3);
        kiir(szam1"+"szam2"+"szam3"gyöke: "Math.sqrt(osszegem));
    }

    private static void feladatok() {
        feladat_10szam();
        feladat_sum2szam(8, 3);
        feladat_sumszam(5, 8, 2, 11);
        feladat_gyok3szam(3, 8, 2);
    }
    
}
