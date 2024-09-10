import java.util.Scanner;

public class Uni4Exe24 {
  public static void main(String[] args) {
    /*
    Dados 3 valores, escreva um algoritmo que os informe em uma determinada 
    ordem a partir de um menu de opções:

    se opção = 1, escreva os 3 valores em ordem crescente
    se opção = 2, escreva os 3 valores em ordem decrescente
    se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
    */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    Integer valor1 = scanner.nextInt();

    System.out.println("Digite o segundo valor: ");
    Integer valor2 = scanner.nextInt();
    
    System.out.println("Digite o terceiro valor: ");
    Integer valor3 = scanner.nextInt();

    System.out.println("Escolha uma opção de saída: \n 1)Retorna os 3 valores em ordem crescente. \n 2)Retorna os 3 valores em ordem decrescente. \n 3)Retorna os 3 valores de forma que o maior valor fique no meio.");
    Integer opcao = scanner.nextInt();

    Integer maior = 0, meio = 0, menor = 0;

    switch (opcao) {
      case 1:
      if (valor1 > valor2 && valor1 > valor3) {
        maior = valor1;
      } else if (valor2 > valor1 && valor2 > valor3) {
        maior = valor2;
      } else if (valor3 > valor1 && valor3 > valor2) {
        maior = valor3;
      }

      if (valor1 < valor2 && valor1 < valor3) {
        menor = valor1;
      } else if (valor2 < valor1 && valor2 < valor3) {
        menor = valor2;
      } else if (valor3 < valor1 && valor3 < valor2) {
        menor = valor3;
      }

      meio = valor1 + valor2 + valor3 - maior - menor;
      System.out.println(menor + " " + meio + " "  + maior);
      break;

      case 2:
      if (valor1 > valor2 && valor1 > valor3) {
        maior = valor1;
      } else if (valor2 > valor1 && valor2 > valor3) {
        maior = valor2;
      } else if (valor3 > valor1 && valor3 > valor2) {
        maior = valor3;
      }

      if (valor1 < valor2 && valor1 < valor3) {
        menor = valor1;
      } else if (valor2 < valor1 && valor2 < valor3) {
        menor = valor2;
      } else if (valor3 < valor1 && valor3 < valor2) {
        menor = valor3;
      }

      meio = valor1 + valor2 + valor3 - maior - menor;
      System.out.println(maior + " " + meio + " "  + menor);
      break;

      case 3:
      if (valor1 > valor2 && valor1 > valor3) {
        maior = valor1;
      } else if (valor2 > valor1 && valor2 > valor3) {
        maior = valor2;
      } else if (valor3 > valor1 && valor3 > valor2) {
        maior = valor3;
      }

      if (valor1 < valor2 && valor1 < valor3) {
        menor = valor1;
      } else if (valor2 < valor1 && valor2 < valor3) {
        menor = valor2;
      } else if (valor3 < valor1 && valor3 < valor2) {
        menor = valor3;
      }

      meio = valor1 + valor2 + valor3 - maior - menor;
      System.out.println(meio + " " + maior + " "  + menor);
      break;

      default:
      System.out.println("Opção Inválida");
    }

    scanner.close();
  }
}
