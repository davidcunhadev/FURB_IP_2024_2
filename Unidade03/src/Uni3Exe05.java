import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        /*
        Uma granja possui um controle automatizado de cada frango da sua produção.
        No pé direito do frango há um anel com um chip de identificação; 
        no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
        Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, 
        faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.
         */
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de frangos da granja: ");
        int totalDeFrangos = scanner.nextInt();
        final double precoAnelChip = 4.00;
        final double precoAnelAlimento = 3.50 * 2;

        double resultado = totalDeFrangos * precoAnelChip + totalDeFrangos * precoAnelAlimento;

        System.out.println("O gasto total da granja para marcar todos os seus frangos é de R$" + resultado);

        scanner.close();
    }
}
