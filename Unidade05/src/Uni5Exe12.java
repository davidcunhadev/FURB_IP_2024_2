import java.util.Scanner;

public class Uni5Exe12 {
  public static void main(String[] args) {
    /*
    Escreva um programa que leia um número inteiro positivo n e em seguida imprima n linhas do chamado Triangulo de Floyd:
    1
    2   3
    4   5   6
    7   8   9   10
    11  12  13  14  15
    16  17  18  19  20  21
    */

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número de linhas para o Triângulo de Floyd: ");
    int n = scanner.nextInt();

    int numero = 1;

    for (int i = 1; i <= n; i++) {

        for (int j = 1; j <= i; j++) {
            System.out.print(numero + "\t");
            numero++; 
        }
        System.out.println();
    }

    scanner.close();

  }
}
