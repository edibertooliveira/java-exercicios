package curso_java_basico.src.listaDeExercicio_16_17;

import java.util.Scanner;

/**
 * Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
 */

public class Exercicio_03 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean infoValida = false;
    System.out.println("Digite seu login e uma senha");
    
    do {
      System.out.println("Digite nome: \n");
      String nome = scan.next();
      
      if(nome.length() >= 3) {
        infoValida = true;
        System.out.println("Nome valida");
      } else {
        System.out.println("Opa! error! Nome precisa ser maior que 3 caracteres");
      }
    } while(!infoValida);
    
    infoValida = false;
    
    do {
      System.out.println("Digite idade: \n");
      short idade = scan.nextShort();
      
      if(idade >= 0 && idade <= 150) {
        infoValida = true;
        System.out.println("Idade valida");
      } else {
        System.out.println("Opa! error! Idade entre 0 e 150");
      }
      
    } while(!infoValida);

    infoValida = false;

    do {
      System.out.println("Digite salário: \n");
      short salario = scan.nextShort();
      
      if(salario > 0) {
        infoValida = true;
        System.out.println("Salário valida");
      } else {
        System.out.println("Opa! error! Salário precisa ser maior que zero");
      }
      
    } while(!infoValida);

    infoValida = false;
    
    do {
      System.out.println("Digite Sexo: \n");
      String sexo = scan.next();
      
      if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
        infoValida = true;
        System.out.println("Sexo valida");
      } else {
        System.out.println("Opa! error! Sexo precisa ser 'f' ou 'm'");
      }
      
    } while(!infoValida);

    infoValida = false;
    
    do {
      System.out.println("Digite Estado Civil '\n s-Solteiro', '\n c-Casado', '\n v-Viúdo', 'd-Divorcio': \n");
      String estadoCivil = scan.next();
      
      if(estadoCivil.equalsIgnoreCase("s") 
      || estadoCivil.equalsIgnoreCase("c")
      || estadoCivil.equalsIgnoreCase("v")
      || estadoCivil.equalsIgnoreCase("d")) {
        infoValida = true;
        System.out.println("Estado Civil valida");
      } else {
        System.out.println("Opa! error! Estado Civil precisa ser 's', 'c', 'v', 'd'");
      }
      
    } while(!infoValida);
    
    scan.close();
    
  }
}