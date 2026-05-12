package com.controleps4;

public class ControleDualShock4 extends ControlePS4 {

    public ControleDualShock4(String cor, String modelo) {
        super(cor, modelo);
    }

    @Override
    public String tipoDeConector() {
        return "Micro USB";
    }
}
