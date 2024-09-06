package model;

import interfaces.PesoIdeal;

public class Mulher implements PesoIdeal {
    private String nome;
    private double peso;
    private double altura;

    public Mulher(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public boolean isPesoIdeal() {
        double pesoIdeal = (62.1 * altura) - 41.7;
        return this.peso == pesoIdeal;
    }

    @Override
    public String toString() {
        return String.format("%s (Mulher) está no peso ideal? %s", nome, isPesoIdeal() ? "Sim" : "Não");
    }
}
