package br.senai.jandira.sp;

import br.senai.jandira.sp.Model.Alunos;
import br.senai.jandira.sp.Model.Pessoas;

public class App {
    public static void main(String[] args) {
        Pessoas felipe = new Pessoas( "Felipe", 18);
        Pessoas emy = new Pessoas( "Emy", 16);

        System.out.println("O nome é: " + felipe.getNome());
        System.out.println("O nome é: " + emy.getNome());

        felipe.setNome("Felipe Zedan");
        System.out.println("O nome é: " + felipe.getNome());


        // aplicando herança

        Pessoas aluno1 = new Alunos("Mario", 20, 1234);
        System.out.println(aluno1.getNome());

        aluno1.exibirInfo();
        //exemplo polimosfismo
        aluno1.passarTempo();

        // exemplo abstração

    }
}
