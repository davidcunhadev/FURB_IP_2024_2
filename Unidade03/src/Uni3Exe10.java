import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        /*
        Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo
        e calcule o comprimento da hipotenusa.
        Fórmula:

        hipotenusa² = cateto1² + cateto2²
         */

         Scanner scanner = new Scanner(System.in);

         System.out.println("Digite o comprimento do primeio cateto: ");
         double cateto1 = scanner.nextDouble();

         System.out.println("Digite o comprimento do segundo cateto: ");
         double cateto2 = scanner.nextDouble();

         double somaCatetos = (cateto1 * cateto1) + (cateto2 * cateto2);

         double hipotenusa = somaCatetos * somaCatetos;

         System.out.println("O comprimento da hipotenusa é de: " + hipotenusa);

         scanner.close();
    }
}
