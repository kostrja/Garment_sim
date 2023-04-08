/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.garment_sim;

/**
 * Based on the problem, it makes sense to utilize the abstract factory design
 * pattern. Included is a representation of a solution
 * @author jameskostrewski
 */
public class Garment_sim {

    public static void main(String[] args) {
        ProfessionalFactory prof = new ProfessionalFactory();
        CasualFactory casf = new CasualFactory();
        PartyFactory parf = new PartyFactory();
        
        // creates and prints a party top utilizing override of toString
        Tops t = parf.createTops();
        System.out.println(t);
        
        // creates and prints casualShoe
        Shoes s = casf.createShoes();
        System.out.println(s);
        
        // creates and prints professional pants
        Pants p = prof.createPants();
        System.out.println(p);
        
    }
}
