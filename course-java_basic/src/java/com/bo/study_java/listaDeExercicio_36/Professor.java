package com.bo.study_java.listaDeExercicio_36;

public class Professor {
  private String nomeProfessor;
  private String departamento;
  private String email;
  
  public Professor(String nomeProfessor, String departamento, String email) {
    this.nomeProfessor = nomeProfessor;
    this.departamento = departamento;
    this.email = email;
  }
  public Professor(String nomeProfessor) {
    this.nomeProfessor = nomeProfessor;
  }
  public String getNomeProfessor() {
    return nomeProfessor;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getDepartamento() {
    return departamento;
  }
  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }
  public void setNomeProfessor(String nomeProfessor) {
    this.nomeProfessor = nomeProfessor;
  }
}
