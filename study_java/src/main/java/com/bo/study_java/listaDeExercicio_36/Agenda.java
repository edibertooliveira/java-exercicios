package com.bo.study_java.listaDeExercicio_36;

import java.util.List;

/**
 * Agenda
 */
public class Agenda {
  private String nomeAgenda;
  private List<Contatos> contatos;

  public Agenda() {
  }

  public Agenda(String nomeAgenda) {
    this.nomeAgenda = nomeAgenda;
  }

  public List<Contatos> getContatos() {
    return contatos;
  }

  public void setContatos(List<Contatos> contatos) {
    this.contatos = contatos;
  }

  public String getNomeAgenda() {
    return nomeAgenda;
  }

  public void setNomeAgenda(String nomeAgenda) {
    this.nomeAgenda = nomeAgenda;
  }

  public void exibirContato() {
    String listaContatos = "Contatos:\n";
    for (Contatos contatos : this.contatos) {
      listaContatos+= contatos.exibirContato() + "\n";
    }
    System.out.println(listaContatos);
  }

}