import java.util.Scanner;

public class Uni5Exe08 {
  public static void main(String[] args) {
    /*
    Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:
    escreva o menor valor negativo;
    escreva a média dos números positivos.
    */

    Scanner scanner = new Scanner(System.in);

    double maior = Double.MIN_VALUE;
    double menor = Double.MAX_VALUE;
    double total = 0;
    double soma = 0;
    Integer contadorPositivos = 0;

    System.out.println("Digite um número inteiro n: ");
    Integer numeroLoop = scanner.nextInt();

    for (int i = 1; i <= numeroLoop; i++) {
      System.out.println("Digite o número " + i + " :");
      double numero = scanner.nextDouble();

      if (numero < 0) {
        if (numero > maior ) {
          maior = numero;
        }
  
        if (numero < menor ) {
          menor = numero;
        }
      }

      if (numero > 0) {
        contadorPositivos++;
        soma+= numero;
      }

      if (contadorPositivos > 0) {
        total = soma / contadorPositivos;
      }

    }

    System.out.println("O menor valor negativo é: " + menor);
    System.out.println("A média dos números positivos é: " + total);

    scanner.close();
  }
}
