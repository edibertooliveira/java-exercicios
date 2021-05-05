package com.bo.study_java.listaDeExercicio_46;

/**
 * Exercicio_3
 */
public class Exercicio_3 {

  public static void main(String[] args) {
    
    Quadrado quadrado = new Quadrado();
    quadrado.setLado(2);

    Circulo circulo = new Circulo();
    circulo.setRaio(2);

    Triangulo triangulo = new Triangulo();
    triangulo.setAltura(2);
    triangulo.setBase(3);

    Cubo cubo = new Cubo();
    cubo.setLado(3);

    Cilindro cilindro = new Cilindro();
    cilindro.setRaio(2);
    cilindro.setAltura(3);

    Piramide piramide = new Piramide();
    piramide.setAltura(3);
    piramide.setApotema(4);
    piramide.setArestaBase(2);
    piramide.setNumPoliBase(4);
    piramide.setBase(quadrado);
  }
}