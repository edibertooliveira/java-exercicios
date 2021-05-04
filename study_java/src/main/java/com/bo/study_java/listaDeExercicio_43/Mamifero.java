package com.bo.study_java.listaDeExercicio_43;

public class Mamifero extends Animal{
  private String alimento;

  public Mamifero() {
    this.setAmbiente("terra");
  }

  public String getAlimento() {
    return alimento;
  }

  public void setAlimento(String alimento) {
    this.alimento = alimento;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder(super.toString());
    builder.append("\nAlimento: " + this.getAlimento());
  
    return builder.toString();
  }
}
