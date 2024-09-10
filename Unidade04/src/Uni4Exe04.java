import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        /*
        Dado um número de ponto flutuante maior do que 0, 
        informe se foram digitadas ou não casas decimais no número.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de ponto flutuante maior que 0: ");
        Double valor = scanner.nextDouble();

        if ((valor - Math.floor(valor) > 0)) {
            System.out.println("Foram digitadas casas decimais.");
        } else {
            System.out.println("Não foram digitadas casas decimais.");
        }

        scanner.close();
    }
}
