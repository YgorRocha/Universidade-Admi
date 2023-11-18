//Criar uma classe de alunos

//Classe de cursos

//Verificar se o aluno passou para o curso desejado

import Alunos.Aluno;
import Alunos.VerificadorUniversidades;
import Universidades.Universidades;

import java.util.Arrays;

public class Main {

    public static void main(String[]args) {
        //Universidades:
        Universidades[] universidades = {
                Universidades.Stanford(),
                Universidades.Harvard(),
                Universidades.Princeton()
        };

        //Alunos
        Aluno aluno1 = Aluno.aluno1();
        Aluno aluno2 = Aluno.aluno2();
        Aluno aluno3 = Aluno.aluno3();
        Aluno aluno4 = Aluno.aluno4();

        VerificadorUniversidades.verificarEAssociarUniversidades(aluno3, universidades);

    }
}

