package model;

import interfaces.PesoIdeal;

public class PessoaAdapter implements PesoIdeal {
    private PesoIdeal pessoa;

    public PessoaAdapter(PesoIdeal pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean isPesoIdeal() {
        return pessoa.isPesoIdeal();
    }

    @Override
    public String toString() {
        return pessoa.toString();
    }
}
