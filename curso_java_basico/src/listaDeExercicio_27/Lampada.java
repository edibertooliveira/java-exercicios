package listaDeExercicio_27;

public class Lampada {
  String modelo;
  String tensao;
  int potencia;
  String corLuz;
  String tipoLuz;
  int garantia;
  String[] tipo;
  boolean statusLampada = false;

  void ligar() {
    statusLampada = true;
  }

  void desligar() {
    statusLampada = false;
  }

  String mudaEstado() {
    if (!statusLampada) {
      ligar();
      return "Ligada";
    }
    desligar();
    return "Desligada";
  }

  String obterEstado() {
    String estado = statusLampada ? "Ligada" : "Desligada";
    return estado; 
  }
  
}
