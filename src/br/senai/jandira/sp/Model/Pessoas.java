package br.senai.jandira.sp.Model;

public class Pessoas extends Conta{

    private String nome;
    private int idade;

    public void passarTempo(){
        System.out.println("A pessoa está passando tmepo...");
    }

    public Pessoas (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public void exibirInfo(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(getSaldo());
    }
}
