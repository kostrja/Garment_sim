/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garment_sim;

/**
 * This class implements GarmentFactory creating items from each of the 3 categories
 * @author jameskostrewski
 */
public class PartyFactory implements GarmentFactory {
    @Override
    public PartyTop createTops() {
        return new PartyTop();
    }
    @Override
    public PartyPants createPants(){
        return new PartyPants();
    }
    @Override
    public PartyShoes createShoes() {
        return new PartyShoes();
    }
}
