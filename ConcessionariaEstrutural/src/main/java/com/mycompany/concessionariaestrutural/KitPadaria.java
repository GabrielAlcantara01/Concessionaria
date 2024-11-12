/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionariaestrutural;
/**
 *
 * @author Aluno-Lab
 */
class KitPadaria implements Carro{
    private Carro carro;

    KitPadaria(Carro carro) {
        this.carro = carro;
    }

    @Override
    public double getCost() {
        return carro.getCost() + 12500;
    }

    @Override
    public String getDescription() {
        return carro.getDescription() + " + Kit Padaria (Turbina + Fueltech)";
    }
}