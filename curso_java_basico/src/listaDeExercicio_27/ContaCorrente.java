package listaDeExercicio_27;

public class ContaCorrente {
  String numero;
  String agencia;
  boolean especial;
  double limiteEspecial = 0;
  double contaEspecialUsado = 0;
  double saldo = 0;

  boolean realizarSaque(double quantiaASacar) {
    if (saldo >= quantiaASacar) {
      saldo -= quantiaASacar;
      return true;

    } else if (especial) {
      double limite = limiteEspecial + saldo;
      if (limite >= quantiaASacar) {
        saldo -= quantiaASacar;
        return true;
      }
      return false;
    }
    return false;
  }

  void realizarDeposito(double quantiaASacar) {
    saldo += quantiaASacar;
  }

  double obterSaldo(){
    return saldo;
  }

  boolean verificarUsoChequeEspecial() {
    if (saldo < 0) {
      return true;
    }
    return false;
  }

}
