import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        /*
        Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica
        com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”, caso seja false.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("A cor é azul?");
        Boolean valorEntrada = scanner.nextBoolean();

        if (valorEntrada) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        scanner.close();
    }
}
