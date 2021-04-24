package listaDeExercicio_24;

import java.util.Date;

/**
 * Exercicio_4
 */
public class Exercicio_4 {

  public static void main(String[] args) {
    LivroBiblioteca livro03 = new LivroBiblioteca();
    livro03.nome = "Arquitetura limpo";
    livro03.autor = "Robert C. Martin";
    livro03.anoLancamento = 2017;
    livro03.qntPaginas = 450;
    livro03.isbn = 123456789;
    livro03.preco = 159.99;
    livro03.livroAlugado = true;
    livro03.dataEntrega = new Date(); 
    livro03.nomePortador = "Ediberto BO"; 
  }
}