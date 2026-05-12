package com.controleps4;

public abstract class ControlePS4 {
    private String cor;
    private String modelo;

    public ControlePS4(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract String tipoDeConector();
}
