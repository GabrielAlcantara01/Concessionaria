/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concessonaria;

/**
 *
 * @author Aluno-Lab
 */
public class Concessonaria {

    public static void main(String[] args) {
        Carro carro = new Gol_G1();
        System.out.println("Valor: R$" + carro.getCost() + ", Descrição: " + carro.getDescription());

        carro = new RodaOrbital(carro);
        System.out.println("Valor: R$" + carro.getCost() + ", Descrição: " + carro.getDescription());
        
        carro = new KitPadaria(carro);
        System.out.println("Valor: R$" + carro.getCost() + ", Descrição: " + carro.getDescription());
    }
}
