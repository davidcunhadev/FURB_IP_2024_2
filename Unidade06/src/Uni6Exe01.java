import java.util.Scanner;

public class Uni6Exe01 {
  private Uni6Exe01() {
    /*
    Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. 
    Escreva na ordem inversa em que foram lidos. 
    Faça um método para ler e outro para escrever.
    */

    Scanner scanner = new Scanner(System.in);
    int valor[] = new int[10];

    valorLer(valor, scanner);

    valorEscrever(valor);

    scanner.close();
  }
  
  private void valorLer(int valor[], Scanner scanner) {
    for (int i = 0; i < valor.length;  i++) {
      System.out.println("Digite um valor");
      valor[i] = scanner.nextInt();
    }
  }

  private void valorEscrever(int valor[]) {
    for (int i = valor.length - 1 ; i >= 0; i--) {
      System.out.println(valor[i]);
    }
  }
  public static void main(String[] args) {
    new Uni6Exe01();
  }
}
