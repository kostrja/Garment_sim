/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garment_sim;

/**
 * This class implements GarmentFactory creating items from each of the 3 categories
 * @author jameskostrewski
 */
public class CasualFactory implements GarmentFactory {
    @Override
    public CasualTop createTops() {
        return new CasualTop();
    }
    @Override
    public CasualPants createPants(){
        return new CasualPants();
    }
    @Override
    public CasualShoes createShoes() {
        return new CasualShoes();
    }
}
