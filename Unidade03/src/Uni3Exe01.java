import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        /*
        Uma imobiliária vende apenas terrenos retangulares. 
        Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
         */

         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Digite a altura: ");
         double altura = scanner.nextDouble();

         System.out.println("Digite a largura: ");
         double largura = scanner.nextDouble();
         
         double resultado = altura * largura;

        System.out.println("Área: " + resultado);

        scanner.close();
    }
}
