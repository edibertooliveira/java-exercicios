package com.bo.study_java.listaDeExercicio_14_15;

import java.util.Scanner;

/**
 * Faça um programa que faça 5 perguntas para uma pessoa sobre um
crime. As perguntas são:
. "Telefonou para a vítima?"
a. "Esteve no local do crime?"
b. "Mora perto da vítima?"
c. "Devia para a vítima?"
d. "Já trabalhou com a vítima?" O programa deve no final emitir
uma classificação sobre a participação da pessoa no crime. Se
a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
como "Assassino". Caso contrário, ele será classificado como
"Inocente".
 */

public class Exercicio_25 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite SIM ou NÂO: Telefonou para a vítima?");
    String pergunta01 = scan.next().toLowerCase();
    System.out.println("Digite SIM ou NÂO: Esteve no local do crime?");
    String pergunta02 = scan.next().toLowerCase();
    System.out.println("Digite SIM ou NÂO: Mora perto da vítima?");
    String pergunta03 = scan.next().toLowerCase();
    System.out.println("Digite SIM ou NÂO: Devia para a vítima?");
    String pergunta04 = scan.next().toLowerCase();
    System.out.println("Digite SIM ou NÂO: Já trabalhou com a vítima?");
    String pergunta05 = scan.next().toLowerCase();
    scan.close();

    int conte = 0;
    if (pergunta01.contains("sim")) conte += 1;
    if (pergunta02.contains("sim")) conte += 1;
    if (pergunta03.contains("sim")) conte += 1;
    if (pergunta04.contains("sim")) conte += 1;
    if (pergunta05.contains("sim")) conte += 1;
    
    if (conte == 2) System.out.println("Você é Suspeito(a)");
    else if (conte >= 3 && conte <= 4) System.out.println("Você é Cúmplice");
    else if (conte >= 5) System.out.println("Assassino");
    else System.out.println("liberado");
  }
}