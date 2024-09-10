import java.util.Scanner;

public class Uni4Exe10 {
  public static void main(String[] args) {
    /*
    Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. 
    Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; 
    suponha que não haja empates.
    */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual a idade do Marquinhos? ");
    int idadeMarquinhos = scanner.nextInt();

    System.out.println("Qual a idade do Zezinho? ");
    int idadeZezinho = scanner.nextInt();

    System.out.println("Qual a idade da Luluzinha? ");
    int idadeLuluzinha = scanner.nextInt();

    if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
      System.out.println("Marquinhos é o caçula da família.");
    } else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
      System.out.println("Zezinho é o caçula da família.");
    } else {
      System.out.println("Luluzinha é a caçula da família.");
    }
    
    scanner.close();
  }
}
