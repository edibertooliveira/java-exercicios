package com.bo.study_java.listaDeExercicio_36;

import java.util.ArrayList;

public class Aluno {
  private String nomeAluno;
  private Integer matricula;
  private ArrayList<Integer> notas;

  public Aluno() {
  }

  public Aluno(String nomeAluno, Integer matricula) {
    this.nomeAluno = nomeAluno;
    this.matricula = matricula;
  }

  public String getNomeAluno() {
    return nomeAluno;
  }

  public ArrayList<Integer> getNotas() {
    return notas;
  }

  public void setNotas(ArrayList<Integer> notas) {
    this.notas = notas;
  }

  public Integer getMatricula() {
    return matricula;
  }

  public void setMatricula(Integer matricula) {
    this.matricula = matricula;
  }

  public void setNomeAluno(String nomeAluno) {
    this.nomeAluno = nomeAluno;
  }

  static ArrayList<Integer> criarListaNotas(int ...rest) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
    for (int i = 0; i < rest.length; i++) {
      arrayList.add(rest[i]);
    }
    return arrayList;
  }

}
