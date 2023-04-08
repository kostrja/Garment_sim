/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.garment_sim;

/**
 * This class implements GarmentFactory creating items from each of the 3 categories
 * @author jameskostrewski
 */
public class ProfessionalFactory implements GarmentFactory{
    @Override
    public ProfessionalTop createTops() {
        return new ProfessionalTop();
    }
    @Override
    public ProfessionalPants createPants(){
        return new ProfessionalPants();
    }
    @Override
    public ProfessionalShoes createShoes() {
        return new ProfessionalShoes();
    }
}
