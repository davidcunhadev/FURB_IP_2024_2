import java.util.Scanner;

public class Uni4Exe25 {
  public static void main(String[] args) {
    /*
    Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a 
    operação correspondente. O algoritmo deve exibir uma mensagem de erro se a opção for inválida. 
    O menu tem as seguintes opções:
    Escolha uma opção:
    1 - Soma de dois números.
    2 - Diferença entre dois números.
    3 - Produto entre dois números.
    4 - Divisão entre dois números (o denominador não pode ser zero). 
    */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha uma opção de saída: \n 1)Soma de dois números. \n 2)Diferença entre dois números. \n 3)Produto entre dois números. \n 4)Divisão entre dois números.");
    Integer opcao = scanner.nextInt();

    System.out.println("Digite o primeiro valor: ");
    Double valor1 = scanner.nextDouble();

    System.out.println("Digite o segundo valor: ");
    Double valor2 = scanner.nextDouble();

    switch (opcao) {
      case 1:
      Double soma = valor1 + valor2;
      System.out.println(soma);
      break;

      case 2:
      Double subtracao = valor1 - valor2;
      System.out.println(subtracao);
      break;

      case 3:
      Double produto = valor1 * valor2;
      System.out.println(produto);
      break;

      case 4:
      if (valor2 == 0) {
        System.out.println("O denominador não pode ser 0.");
        break;
      }
      Double divisao = valor1 / valor2;
      System.out.println(divisao);
      break;
      
      default:
      System.out.println("Opção Inválida");
    }

    scanner.close();
  }
}
