package com.bo.study_java.listaDeExercicio_36;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercicio_1
 * 
 */
public class Exercicio_1 {
  public static void main(String[] args) {
  Contatos contato01 = new Contatos("Pedro", "7133813932", "pedro@pedro.com");
  Contatos contato02 = new Contatos("Miguel", "7133283932", "miguel@miguel.com");
  Contatos contato03 = new Contatos("Maria", "7136883932", "maria@maria.com");
  
  List<Contatos> listContatos = new ArrayList<Contatos>();
  listContatos.add(contato01);
  listContatos.add(contato02);
  listContatos.add(contato03);

  Agenda ag = new Agenda("Amigos");
  ag.setContatos(listContatos);
  ag.exibirContato();

}
  
}