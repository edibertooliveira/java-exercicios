package com.animais;


public class Gato extends Mamifero implements AnimalEstimacao, AnimalDomestico{
    private String raca;

    public Gato(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }
}
