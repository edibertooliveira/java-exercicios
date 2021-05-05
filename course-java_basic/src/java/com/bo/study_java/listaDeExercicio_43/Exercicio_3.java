package com.bo.study_java.listaDeExercicio_43;

/**
 * Exercicio_3
 */
public class Exercicio_3 {
  public static void main(String[] args) {
    Animal camelo = new Animal();
    camelo.setNome("Camelo");
    camelo.setTamanho(150);
    camelo.setCor("Amarelo");
    camelo.setVelocidade(2);

    Animal tubaracao = new Peixe();
    tubaracao.setNome("tubarao");
    tubaracao.setTamanho(300);
    tubaracao.setVelocidade(1.5);

    Mamifero urso = new Mamifero();
    urso.setNome("Urso-do-canadá");
    urso.setTamanho(180);
    urso.setVelocidade(0.5);
    urso.setAlimento("Mel");

    System.out.println(camelo);
    System.out.println(tubaracao);
    System.out.println(urso);
  }  
}