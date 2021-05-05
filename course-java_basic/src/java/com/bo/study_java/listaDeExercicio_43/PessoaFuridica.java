package com.bo.study_java.listaDeExercicio_43;

public class PessoaFuridica extends Contribuinte {
  private String cnpj;

  public PessoaFuridica(String nome, String cnpj, double rendaBruta) {
    super(nome, rendaBruta);
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  @Override
  public double calcularImposto() {
    return (this.getRendaBruta() / 100) * 10;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Pessoa furidica [\n");
    builder.append("Nome: " + this.getNome());
    builder.append("; CNPJ: " + this.getCnpj());
    builder.append("; Imposto a ser pago: " + this.calcularImposto());
    builder.append("\n ]");
    return builder.toString();
  }
}
