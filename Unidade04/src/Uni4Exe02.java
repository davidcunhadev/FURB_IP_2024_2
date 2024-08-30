import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        /*
        Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro maior do que 0: ");
        int valorEntrada = scanner.nextInt();

        if (valorEntrada % 2 == 0) {
            System.out.println("Número é par.");
        } else {
            System.out.println("Número é ímpar.");
        }

        scanner.close();
    }
}
