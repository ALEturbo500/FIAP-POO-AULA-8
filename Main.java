package com.controleps4;

public class Main {
    public static void main(String[] args) {
        // Tentando criar um objeto da classe abstrata (isso causará um erro de compilação)
        // ControlePS4 controleGenerico = new ControlePS4("Preto", "Genérico");
        // System.out.println("Cor: " + controleGenerico.getCor() + ", Modelo: " + controleGenerico.getModelo() + ", Conector: " + controleGenerico.tipoDeConector());

        // Criando objetos das subclasses
        ControleDualShock4 dualShock4 = new ControleDualShock4("Preto", "DualShock 4");
        System.out.println("Cor: " + dualShock4.getCor() + ", Modelo: " + dualShock4.getModelo() + ", Conector: " + dualShock4.tipoDeConector());
    }
}
