import java.util.Scanner;

public class Uni5Exe01 {
  public static void main(String[] args) {
    /*Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.*/

    Scanner scanner = new Scanner(System.in);
    
    for (int i = 0; i < 20; i++) {
      System.out.println("Escreva um número inteiro:");
      int entrada = scanner.nextInt();
      
      if (entrada % 2 == 0) {
        System.out.println("O número é par.");
      } else {
        System.out.println("O número é impar.");
      }
    }
    scanner.close();
  }
}
