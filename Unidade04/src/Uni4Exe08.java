import java.util.Scanner;

public class Uni4Exe08 {
  public static void main(String[] args) {
    /*
    Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
    */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a letra: ");
    String letra = scanner.nextLine().toUpperCase();

    if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
      System.out.println("É vogal.");
    } else {
      System.out.println("NÃO é vogal.");
    }

    scanner.close();
  }
}
