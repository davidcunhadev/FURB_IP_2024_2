import java.util.Scanner;

public class Uni4Exe09 {
  public static void main(String[] args) {
    /*
    Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.
    */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    int valor1 = scanner.nextInt();

    System.out.println("Digite o segundo valor: ");
    int valor2 = scanner.nextInt();

    if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
      System.out.println(valor1 + " e " + valor2 + " são múltiplos!");
    } else {
      System.out.println(valor1 + " e " + valor2 + " NÃO são múltiplos!");
    }

    scanner.close();
    
  }
}
