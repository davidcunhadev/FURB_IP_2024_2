import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        /*
        Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
        Faça um programa para ler o comprimento e altura de uma parede (em metros), 
        e depois escrever o valor gasto com a compra de azulejos. 
        Considere que um metro quadrado é formado por 9 azulejos.
         */
        
        Scanner scanner = new Scanner(System.in);

        double azulejoEstampado = 12.50;
        double metroQuadrado = azulejoEstampado * 9;

        System.out.println("Digite o comprimento da parede em metros: ");
        double comprimentoParede = scanner.nextDouble();

        System.out.println("Digite a altura da parede em metros: ");
        double alturaParede = scanner.nextDouble();

        double valorTotalGasto = metroQuadrado * (comprimentoParede * alturaParede);

        System.out.println("O valor total gasto na compra de azulejos foi de: R$" + valorTotalGasto);

        scanner.close();
    }
}
