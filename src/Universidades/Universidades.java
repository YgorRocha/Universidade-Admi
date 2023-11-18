package Universidades;

public class Universidades {
    private String name;
    private double notaDeCorte;

    // Constructor

    public Universidades(String name, double notaDeCorte) {
        this.name = name;
        this.notaDeCorte = notaDeCorte;
    }


    // GETTER AND SETTER


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNotaDeCorte() {
        return notaDeCorte;
    }

    public void setNotaDeCorte(double notaDeCorte) {
        this.notaDeCorte = notaDeCorte;
    }
    // Criando os objetos:

    public static Universidades Stanford() {
        return new Universidades("Stanford", 8);
    }

    public static Universidades Harvard(){
        return new Universidades("Harvard", 9);
    }

    public static Universidades Princeton(){
        return new Universidades("Princeton", 7);
    }
}
