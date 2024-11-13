import java.util.Scanner;

public class Uni6Exe10 {
  private int contador = 0;

  private Uni6Exe10() {
    /*
    Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, faça um programa que construa um menu com as seguintes opções:

    “1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. Informe o usuário se o valor foi incluído no vetor ou não;
    “2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;
    “3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar (só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. Caso contrário, informe “número não encontrado”;
    “4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. Informe o usuário se o valor foi excluído do vetor ou não. A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
    “5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;
    “6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;
    “7 – Inverter valores”: desafio (ver abaixo);
    “8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa. 

    Faça um método para cada uma das opções do menu. O menu deve-se repetir até que o usuário escolha a opção 8.
    */
    Scanner scanner = new Scanner(System.in);
    int vetor[] = new int[5];
    boolean fecharPrograma = false;

    while (!fecharPrograma) {
      System.out.println(" ");
      System.out.println("Escolha uma opção:");
      System.out.println(" ");
      System.out.println("1 - Incluir valor");
      System.out.println("2 - Pesquisar valor");
      System.out.println("3 - Alterar valor");
      System.out.println("4 - Excluir valor");
      System.out.println("5 - Mostrar valores");
      System.out.println("6 - Ordenar valores");
      System.out.println("7 - Inverter valores");
      System.out.println("8 - Sair do sistema");

      int escolha = scanner.nextInt();

      switch (escolha) {
        case 1:
          System.out.println(" ");
          incluirValor(scanner, vetor);
          break;

        case 2:
          System.out.println(" ");
          pesquisarValor(scanner, vetor);
          break;

        case 3:
          System.out.println(" ");
          alterarValor(scanner, vetor);
          break;

        case 4:
          System.out.println(" ");
          excluirValor(scanner, vetor);
          break;

        case 5:
          System.out.println(" ");
          mostrarValores(vetor);
          break;

        case 6:
          System.out.println(" ");
          ordenarValores(vetor);
          mostrarValores(vetor);
          break;

        case 7:
          System.out.println(" ");
          inverterValores(vetor);
          mostrarValores(vetor);
          break;

        case 8:
          System.out.println(" ");
          fecharPrograma = true;
          break;

        default:
          System.out.println("As opções vão de 1 a 8.");
      }
    }
    scanner.close();
  }

  private void incluirValor(Scanner scanner, int[] vetor) {
    if (vetor.length > contador) {
      System.out.println("Insira o valor a ser adicionado no array: ");
      vetor[contador] = scanner.nextInt();
      System.out.println("Valor adicionado.");
      contador++;
    } else {
      System.out.println("O vetor está cheio.");
    }
  }

  private void pesquisarValor(Scanner scanner, int[] vetor) {
    System.out.println("Digite um número para ser incluso no array: ");
    int numeroASerVerificado = scanner.nextInt();
    boolean numeroEncontrado = false;

    for (int i = 0; i < contador; i++) {
      if (vetor[i] == numeroASerVerificado) {
        numeroEncontrado = true;
        break;
      }
    }

    if (numeroEncontrado) {
      System.out.println("O número " + numeroASerVerificado + " está incluso no array.");
    } else {
      System.out.println("O número " + numeroASerVerificado + " não está incluso no array.");
    }
  }

  private void alterarValor(Scanner scanner, int[] vetor) {
    System.out.println("Digite um número do array para ser alterado: ");
    int numeroASerAlterado = scanner.nextInt();
    boolean numeroEncontrado = false;

    for (int i = 0; i < contador; i++) {
      if (vetor[i] == numeroASerAlterado) {
        System.out.println("Digite o novo número para este valor: ");
        int novoNumero = scanner.nextInt();
        vetor[i] = novoNumero;
        numeroEncontrado = true;
        break;
      }
    }

    if (!numeroEncontrado) {
      System.out.println("Número " + numeroASerAlterado + " não encontrado.");
    }
  }

  private void excluirValor(Scanner scanner, int[] vetor) {
    System.out.println("Digite um valor para ser excluído do vetor: ");
    int numeroASerExcluido = scanner.nextInt();
    boolean numeroEncontrado = false;

    for (int i = 0; i < contador; i++) {
      if (vetor[i] == numeroASerExcluido) {
        numeroEncontrado = true;
        for (int j = i; j < contador - 1; j++) {
          vetor[j] = vetor[j + 1];
        }
        vetor[contador - 1] = 0;
        contador--;
        System.out.println("Número " + numeroASerExcluido + " excluído do vetor.");
        break;
      }
    }

    if (!numeroEncontrado) {
      System.out.println("Número " + numeroASerExcluido + " não encontrado.");
    }
  }

  
  private void mostrarValores(int[] vetor) {
    for (int i = 0; i < contador; i++) {
      System.out.println(vetor[i]);
    }
  }
  
  private int[] ordenarValores(int[] vetor) {
    for (int i = 0; i < contador - 1; i++) {
      for (int j = 0; j < contador - i - 1; j++) {
        if (vetor[j] > vetor[j + 1]) {
          int temp = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = temp;
        }
      }
    }
    System.out.println("Valores ordenados.");
    return vetor;
  }

  private void inverterValores(int[] vetor) {
    for (int i = 0; i < contador / 2; i++) {
        int temp = vetor[i];
        vetor[i] = vetor[contador - i - 1];
        vetor[contador - i - 1] = temp;
    }
    System.out.println("Valores invertidos.");
}

  public static void main(String[] args) {
    new Uni6Exe10();
  }
}
