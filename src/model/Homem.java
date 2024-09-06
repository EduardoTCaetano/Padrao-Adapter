package model;

import interfaces.PesoIdeal;

public class Homem implements PesoIdeal {
    private String nome;
    private double peso;
    private double altura;

    public Homem(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public boolean isPesoIdeal() {
        double pesoIdeal = (72.2 * altura) - 58;
        return this.peso == pesoIdeal;
    }

    @Override
    public String toString() {
        return String.format("%s (Homem) está no peso ideal? %s", nome, isPesoIdeal() ? "Sim" : "Não");
    }
}
