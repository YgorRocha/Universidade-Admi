package Alunos;

public class Aluno {
    private String nome;
    private String cpf;
    private int idade;
    private double[] notas;

    //CONSTRUCTOR

    public Aluno(String nome, String cpf, int idade, double[] notas) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.notas = notas;
    }


    //GETTIN AND SETTER

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getNota() {
        return notas;
    }

    public void setNota(double[] notas) {
        this.notas = notas;
    }

    //método de ver a média

    public double calcularMedia(){
        double soma = 0;

        for(double nota : this.notas ){
            soma += nota;
        }
        return soma / notas.length;
    }

    //Criando Objeto:

    public static Aluno aluno1(){
        double[] notasAluno1 = {10, 9.9, 9.8, 10};
        return new Aluno("John", "123.456.789-09", 29, notasAluno1);
    }

    public static Aluno aluno2(){
        double[] notasAluno2 = {5.5, 9.9, 9.5, 8};
       return new Aluno("Jenne", "185.752.154-74", 21, notasAluno2);
    }

    public static Aluno aluno3(){
        double[] notasAluno3 = {9.5, 7.9, 8.5, 7};
        return new Aluno("Leo", "103.441.789-08", 20, notasAluno3);
    }

    public static Aluno aluno4(){
        double[] notasAluno4 = {6.5, 6.9, 7.5, 5};
        return new Aluno("John", "126.786.329-09", 21, notasAluno4);
    }
}





