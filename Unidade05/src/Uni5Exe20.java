import java.util.Scanner;

public class Uni5Exe20 {
  public static void main(String[] args) {
    /*
    Um determinado material radioativo perde metade de sua massa a cada 50 segundos. 
    Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0,5 gramas. 
    Escreva a massa inicial, a massa final e o tempo. 
    */

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a massa inicial do material (em Kg): ");
    double massaInicial = scanner.nextDouble();

    double massaFinal = massaInicial;
    int tempo = 0;

    double limiteMassa = 0.5 / 1000;

    while (massaFinal >= limiteMassa) {
        massaFinal /= 2;
        tempo += 50;
    }

    System.out.printf("Massa inicial: %.3f Kg\n", massaInicial);
    System.out.printf("Massa final: %.3f Kg\n", massaFinal);
    System.out.printf("Tempo necessário: %d segundos\n", tempo);

    scanner.close();
  }
}
