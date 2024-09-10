import java.util.Scanner;

public class Uni4Exe26 {
  public static void main(String[] args) {
    /*
    Dado um caractere indicando uma opção, escreva um algoritmo para:

    se opção = ‘T’: calcular a área de um triângulo de base b e altura h
    se opção = ‘Q’: calcular a área de um quadrado de lado l
    se opção = ‘R’: calcular a área de um retângulo de base b e altura h
    se opção = ‘C’: calcular a área de um círculo de raio r 
    */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha uma opção: \n T)Calcular a área de um triângulo. \n Q)Calcular a área de um quadrado. \n R)Calcular a área de um retângulo. \n C)Calcular a área de um círculo.");
    Character opcao = scanner.nextLine().toUpperCase().charAt(0);

    switch (opcao) {
      case 'T':
      System.out.println("Digite a base e a altura do triângulo: ");
      Double base = scanner.nextDouble();
      Double altura = scanner.nextDouble();

      System.out.println("Base do triângulo = " + base * altura / 2);
      break;

      case 'Q':
      System.out.println("Digite o lado: ");
      Double lado = scanner.nextDouble();

      System.out.println("Área do quadrado = " + lado * lado);

      case 'R':
      System.out.println("Digite a base e a altura do retângulo: ");
      Double b = scanner.nextDouble();
      Double h = scanner.nextDouble();

      System.out.println("Área do retângulo = " + b * h);

      case 'C':
      System.out.println("Digite o raio: ");
      Double raio = scanner.nextDouble();

      System.out.println("Área do círculo = " + Math.PI * Math.pow(raio, 2));
    }

    scanner.close();
  }
}
