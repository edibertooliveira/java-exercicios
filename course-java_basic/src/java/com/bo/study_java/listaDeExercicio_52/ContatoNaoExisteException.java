package main.java.com.bo.study_java.listaDeExercicio_52;

/**
 * ContatoNaoExisteException
 */
public class ContatoNaoExisteException {

  private String nomeContato;

  public ContatoNaoExisteException(String nomeContato) {
      this.nomeContato = nomeContato;
  }

  @Override
  public String getMessage() {
      return "Contato " + nomeContato + " não existe na agenda!";
  }
  
}