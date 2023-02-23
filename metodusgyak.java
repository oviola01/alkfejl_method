/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.method;

/**
 *
 * @author User
 */
public class metodusgyak {
    public static void main(String[] args){
        kiir("Az első 10 szám összege: " + osszeg);
    }
    
    private static void kiir(String szoveg) {
        System.out.printf(szoveg);
    }
    
    private static void elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        
    }
    
}
