import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        /*
        Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
        Considerando que alguém está pagando uma compra, faça um programa que determine
        e escreva o número mínimo de notas que o caixa deve fornecer como troco. 
        Escreva também o número de cada tipo de nota a ser fornecido como troco. 
        Suponha que o sistema monetário não utilize centavos.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do troco: ");
        int troco = scanner.nextInt();

        int notas100 = troco / 100;
        troco = troco % 100;

        int notas10 = troco / 10;
        troco = troco % 10;

        int notas1 = troco;
        troco = troco % 1;

        int totalNotasDevolvidas = notas100 + notas10 + notas1;

        System.out.println("O número de notas de R$100 devolvidas foi de: " + notas100);
        System.out.println("O número de notas de R$10 devolvidas foi de: " + notas10);
        System.out.println("O número de notas de R$1 devolvidas foi de: " + notas1);
        System.out.println("O número de notas a ser devolvidas é de " + totalNotasDevolvidas);

        scanner.close();
    }
}
