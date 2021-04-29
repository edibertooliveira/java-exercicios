package com.animais;

public class Cachorro extends Mamifero implements AnimalDomestico, AnimalEstimacao{
    private double tamanho;
    private String raca;

    public Cachorro(String nome) {
        super(nome);
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
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

    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {

    }
}
