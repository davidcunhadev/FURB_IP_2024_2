import java.util.Scanner;

public class Uni5Exe05 {
  public static void main(String[] args) {
    /*
    Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:
    8, 10, 16, 18, 32, 34, 64...

    O valor n deve ser lido e deve ser maior do que 2.
     */

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor de n (maior que 2): ");
    int n = scanner.nextInt();

    if (n <= 2) {
        System.out.println("O valor de n deve ser maior que 2.");
        scanner.close();
        return;
    }

    int termo1 = 8;
    int termo2 = 10;

    int proximoTermo;

    for (int i = 3; i <= n; i++) {
        if (i % 2 != 0) {
            proximoTermo = termo2 * 2;
        } else {
            proximoTermo = termo2 + 2;
        }

        System.out.println(termo1 + ", " + termo2 + ", " + proximoTermo);

        termo2 = proximoTermo;
    }

    scanner.close();
}
}
