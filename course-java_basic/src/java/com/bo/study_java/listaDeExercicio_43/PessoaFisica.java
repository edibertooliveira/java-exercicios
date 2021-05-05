package com.bo.study_java.listaDeExercicio_43;

public class PessoaFisica extends Contribuinte{
  private String cpf;

  public PessoaFisica(String nome, String cpf, double rendaBruta) {
    super(nome, rendaBruta);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public double calcularImposto() {
    double renda = this.getRendaBruta();
    if ( renda <= 1400) return 0;
    if ( renda > 1400.01 && renda <= 2100) return (renda * 0.1) - 100;
    if ( renda > 2100.01 && renda <= 2800) return (renda * 0.15) - 270;
    if ( renda > 2800.01 && renda <= 3600) return (renda * 0.25) - 500;
    return (renda * 0.3) - 700;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Pessoa física [\n");
    builder.append("Nome: " + this.getNome());
    builder.append("; CPF: " + this.getCpf());
    builder.append("; Imposto a ser pago: " + this.calcularImposto());
    builder.append("\n ]");
    return builder.toString();
  }
}
