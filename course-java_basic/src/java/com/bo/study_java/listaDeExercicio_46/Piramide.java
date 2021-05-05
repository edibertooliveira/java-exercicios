package com.bo.study_java.listaDeExercicio_46;

public class Piramide extends Figura3D {
  private double altura;
  private double arestaBase;
  private double apotema;
  private double numPoliBase;
  private Figura2D base;

  public double getAltura() {
    return altura;
  }
  public double getNumPoliBase() {
    return numPoliBase;
  }
  public void setNumPoliBase(double numPoliBase) {
    this.numPoliBase = numPoliBase;
  }
  public Figura2D getBase() {
    return base;
  }
  public void setBase(Figura2D base) {
    this.base = base;
  }
  public double getApotema() {
    return apotema;
  }
  public void setApotema(double apotema) {
    this.apotema = apotema;
  }
  public double getArestaBase() {
    return arestaBase;
  }
  public void setArestaBase(double arestaBase) {
    this.arestaBase = arestaBase;
  }
  public void setAltura(double altura) {
    this.altura = altura;
  }
  @Override
  public double calcularVolume() {
    if(this.getBase() != null) return (this.getBase().calcularArea() * this.getAltura()) / 3;
    return 0;
  }

  @Override
  public double calcularArea() {
    if(this.getBase() != null) return (this.getNumPoliBase() * ((this.getArestaBase() * this.getApotema()) / 2)) + this.getBase().calcularArea();
    return 0;
  }
}
