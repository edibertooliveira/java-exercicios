package com.bo.study_java.listaDeExercicio_36;

/**
 * Exercicio_2
 */
public class Exercicio_2 {

  public static void main(String[] args) {
    Curso curso01 = new Curso("Lógica de programação");
    curso01.setNomeProfessor(new Professor("Marcio Cardoso", "Corpo docente", "marcio@marcio.com"));
    curso01.getListaAlunos();

    Aluno colega01 = new Aluno("Mateus", 001);
    colega01.setNotas(colega01.criarListaNotas(5, 8, 4, 7));

    Aluno colega02 = new Aluno("Lia", 002);
    colega02.setNotas(colega02.criarListaNotas(7, 8, 4, 7));

    Aluno colega03 = new Aluno("Vini", 003);
    colega03.setNotas(colega03.criarListaNotas(8, 8, 9, 7));

    Aluno colega04 = new Aluno("Fabricio", 004);
    colega04.setNotas(colega04.criarListaNotas(8, 8, 3, 4));

    Aluno colega05 = new Aluno("Rafael", 005);
    colega05.setNotas(colega05.criarListaNotas(7, 5, 5, 6));

    curso01.setListaAlunos(curso01.criarListaAlunos(colega01,colega02,colega03,colega04,colega05));
    
  }
}