import java.util.Scanner;

public class Uni4Exe16 {
  public static void main(String[] args) {
    /*
     * Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres
     * (considere que a idade entre homens e mulheres sempre serão diferentes).
     * Calcule e escreva a soma das idades do homem mais velho com a mulher mais
     * nova,
     * e o produto das idades do homem mais novo com a mulher mais velha.
     */

    Scanner scanner = new Scanner(System.in);
    int soma = 0;
    int produto = 0;

    System.out.println("Digite a idade do primeiro homem: ");
    int idadeH1 = scanner.nextInt();

    System.out.println("Digite a idade do segundo homem: ");
    int idadeH2 = scanner.nextInt();

    System.out.println("Digite a idade da primeira mulher: ");
    int idadeM1 = scanner.nextInt();

    System.out.println("Digite a idade da segunda mulher: ");
    int idadeM2 = scanner.nextInt();

    if (idadeH1 > idadeH2 && idadeM1 > idadeM2) {
      soma = idadeH1 + idadeM2;
      produto = idadeH2 * idadeM1;
    } else if (idadeH1 > idadeH2 && idadeM2 > idadeM1) {
      soma = idadeH1 + idadeM1;
      produto = idadeH2 * idadeM2;
    } else if (idadeH2 > idadeH1 && idadeM1 > idadeM2) {
      soma = idadeH2 + idadeM2;
      produto = idadeH1 * idadeM1;
    } else if (idadeH2 > idadeH1 && idadeM2 > idadeM1) {
      soma = idadeH2 + idadeM1;
      produto = idadeH1 * idadeM2;
    }

    System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + soma);
    System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produto);

    scanner.close();
  }
}
