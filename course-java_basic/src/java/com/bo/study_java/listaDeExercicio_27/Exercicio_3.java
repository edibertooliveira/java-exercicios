package com.bo.study_java.listaDeExercicio_27;

import java.util.Scanner;

/**
 * Exercicio_3 Escreva uma class para representar um Aluno. Adicione atributos
 * relacionados às caracteristicas de um Aluno, como nome, matricula, curso
 * que está matriculado, nome de 3 disciplinas que está cursando e as notas
 * dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está
 * aprovado (nota maior ou igual a 7) em uma determinada disciplina.
 * Escreva um programa para testar essa classe, que pede as informações do
 * aluno ao usuário e ao final informa o nome das disciplinas, mostra as
 * notas e mostra se o aluno foi aprovado ou não.
 * 
 */
public class Exercicio_3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Matricula alunoA = new Matricula();

    System.out.println("Entre com o nome do aluno: ");
    alunoA.nome = scan.next();

    System.out.println("Matrícula: ");
    alunoA.matricula = scan.nextInt();

    System.out.println("Nome do curso: ");
    alunoA.curso = scan.next();

    System.out.println("Digite 3 disciplinas e suas 4 notas para cada");
    for (int i = 0; i < alunoA.disciplinas.length; i++) {
      System.out.println("Disciplina " + (i + 1));
      alunoA.disciplinas[i] = scan.next();
      for (int j = 0; j < alunoA.notas[i].length; j++) {
        System.out.println("nota " + (j + 1) );
        alunoA.notas[i][j] = scan.nextInt();
      }
    }
    
    System.out.println("Seu Boletim de final");
    System.out.println("+---------------------+");
    System.out.println("Aluno: " + alunoA.nome + "       Matricula: " + alunoA.matricula);
    boolean aprovado = true;
    for (int i = 0; i < alunoA.disciplinas.length; i++) {
      String disciplina = alunoA.disciplinas[i];
      double media, soma = 0;
      boolean status;
      System.out.println("| Discíplina " + disciplina + ":" + " |");
      for (int j = 0; j < alunoA.notas[i].length; j++) {
        double nota = alunoA.notas[i][j];
        soma += nota;
        System.out.println("| Nota " + (j + 1) + ": " + nota + "         |");
      }
      media = (soma/alunoA.notas[i].length);
      status = alunoA.verificarAprocacao(media);
      if(!status) aprovado = false;
      System.out.println("| Média: " + media + "    |");
      System.out.println("| Status: " + (status ? "Aprovado" : "Reprovado") + "    |");
      soma = 0;
    }
    System.out.println("| Aluno "+ (aprovado ? "Aprovado" : "Reprovado") + "          |");
    System.out.println("+---------------------+");



  }
}