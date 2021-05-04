package com.bo.study_java.listaDeExercicio_36;

/**
 * Contatos
 */
public class Contatos {

  private String nomeContato;
  private String email;
  private String telefone;

  public Contatos() {
  }

  public Contatos(String nomeContato, String email, String telefone) {
    this.nomeContato = nomeContato;
    this.email = email;
    this.telefone = telefone;
  }
  
  public String getNomeContato() {
    return nomeContato;
  }
  public void setNomeContato(String nomeContato) {
    this.nomeContato = nomeContato;
  } 
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String exibirContato() {
    String contato = "Nome: " + nomeContato + "; " +
    "Telefone: " + telefone + "; " +
    "Email: " + email + ";" ;
    return contato;
  }
  
}