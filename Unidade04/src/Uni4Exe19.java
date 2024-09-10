import java.util.Scanner;

public class Uni4Exe19 {
  public static void main(String[] args) {
    /*
    Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado
    */

    Scanner scanner = new Scanner(System.in);

    Double X = scanner.nextDouble();
    Double Y = scanner.nextDouble();

    if (X == 0 && Y == 0) {
      System.out.println("Quadrante 0");
    } else if (X > 0 && Y > 0) {
      System.out.println("Quadrante 1");
    } else if (X > 0 && Y < 0) {
      System.out.println("Quadrante 2");
    } else if (X < 0 && Y < 0) {
      System.out.println("Quadrante 3");
    } else if (X < 0 && Y > 0) {
      System.out.println("Quadrante 4");
    }

    scanner.close();
  }
}
