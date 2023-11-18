package Alunos;

import Universidades.Universidades;

import java.util.Arrays;

public class VerificadorUniversidades {

    public static void verificarEAssociarUniversidades(Aluno aluno, Universidades[] universidades){
        double mediaDoAluno = aluno.calcularMedia();

        for(Universidades universidade : universidades){
            if(mediaDoAluno >= universidade.getNotaDeCorte()){
                System.out.println(aluno.getNome() + " Sua nota de corte foi " + aluno.calcularMedia() + "  você foi aprovado na Universidade " + universidade.getName());
            }else {
                System.out.println(aluno.getNome() + " Sua nota de corte foi " + aluno.calcularMedia() + " Infelizmente você não obteve a nota necessaria para ingressar em " + universidade.getName());
            }
        }
    }
}
