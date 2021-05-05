package com.bo.study_java.listaDeExercicio_27;

public class Matricula {
  String nome;
  Integer matricula;
  String curso;
  String[] disciplinas = new String[3];
  double[][] notas = new double[3][4];

  public boolean verificarAprocacao(double media) {
    if(media >= 7) {
      return true;
    }
    return false;
  }
}
