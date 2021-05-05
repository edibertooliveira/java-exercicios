package com.bo.study_java.listaDeExercicio_36;

import java.util.ArrayList;
import java.util.List;

public class Curso {
  private String nomeCurso;
  private Professor nomeProfessor;
  private List<Aluno> listaAlunos;
  private String horario;
  
  public Curso() {
  }

  public Curso(String nomeCurso) {
    this.nomeCurso = nomeCurso;
  }
  
  public String getNomeCurso() {
    return nomeCurso;
  }
  public String getHorario() {
    return horario;
  }
  public void setHorario(String horario) {
    this.horario = horario;
  }
  public List<Aluno> getListaAlunos() {
    return listaAlunos;
  }
  public void setListaAlunos(List<Aluno> listaAlunos) {
    this.listaAlunos = listaAlunos;
  }
  public Professor getNomeProfessor() {
    return nomeProfessor;
  }
  public void setNomeProfessor(Professor nomeProfessor) {
    this.nomeProfessor = nomeProfessor;
  }
  public void setNomeCurso(String nomeCurso) {
    this.nomeCurso = nomeCurso;
  }

  static ArrayList<Aluno> criarListaAlunos(Aluno ...rest) {
    ArrayList<Aluno> arrayList = new ArrayList<Aluno>(); 
    for (int i = 0; i < rest.length; i++) {
      arrayList.add(rest[i]);
    }
    return arrayList;
  }
}
