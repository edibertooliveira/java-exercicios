package com.bo.study_java.listaDeExercicio_43;

public class Peixe extends Animal {
  private String caracteristicas;
  
  public Peixe() {
    this.setNumeroPatas(0);
    this.setAmbiente("Mar");
    this.setCor("Cinzenta");
    this.caracteristicas  = "barbatanas e cauda"; 
  }

  public String getCaracteristicas() {
    return caracteristicas;
  }

  public void setCaracteristicas(String caracteristicas) {
    this.caracteristicas = caracteristicas;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder(super.toString());
    builder.append("\nCaracteristicas: " + this.getCaracteristicas());
  
    return builder.toString();
  }
}
