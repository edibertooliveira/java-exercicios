package com.bo.study_java.listaDeExercicio_33;

public class Matricula {
  private String nome;
  private Integer matricula;
  private String curso;
  private String[] disciplinas = new String[3];
  private double[][] notas = new double[3][4];

  public Matricula() {
  }

  public Matricula(String nome, Integer matricula, String curso, String[] disciplinas, double[][] notas) {
    this.nome = nome;
    this.matricula = matricula;
    this.curso = curso;
    this.disciplinas = disciplinas;
    this.notas = notas;
  }

  static boolean verificarAprocacao(double media) {
    if(media >= 7) {
      return true;
    }
    return false;
  }

  public double[][] getNotas() {
    return notas;
  }

  public void setNotas(double[][] notas) {
    this.notas = notas;
  }

  public String[] getDisciplinas() {
    return disciplinas;
  }

  public void setDisciplinas(String[] disciplinas) {
    this.disciplinas = disciplinas;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public Integer getMatricula() {
    return matricula;
  }

  public void setMatricula(Integer matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
