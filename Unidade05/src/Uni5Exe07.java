import java.util.Scanner;

public class Uni5Exe07 {
  public static void main(String[] args) {
    /*
    Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.
    */

    Scanner scanner = new Scanner(System.in);

    double maior = Double.MIN_VALUE;
    double menor = Double.MAX_VALUE;

    System.out.println("Digite um número inteiro n: ");
    Integer numeroLoop = scanner.nextInt();

    for (int i = 1; i <= numeroLoop; i++) {
      System.out.println("Digite o número " + i + " :");
      double numero = scanner.nextDouble();

      if (numero > maior ) {
        maior = numero;
      }

      if (numero < menor ) {
        menor = numero;
      }
    }

    System.out.println("O maior número é: " + maior);
    System.out.println("O menor número é: " + menor);

    scanner.close();
  }
}
