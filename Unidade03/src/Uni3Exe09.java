import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {

        /*
        Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:

        volume = PI * raio² * altura
         */

        Scanner scanner = new Scanner(System.in);

        double PI = Math.PI;

        System.out.println("Digite o raio da lata de óleo: ");
        double raio = scanner.nextDouble();

        System.out.println("Digite a altura da lata de óleo: ");
        double altura = scanner.nextDouble();

        double volume = PI * (raio * raio) * altura;

        System.out.println("O volume da lata de óleo é de " + volume);
        
        scanner.close();
    }
}
