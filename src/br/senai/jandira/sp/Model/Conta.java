package br.senai.jandira.sp.Model;

abstract class Conta {
    private double saldo=1000;

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
}
