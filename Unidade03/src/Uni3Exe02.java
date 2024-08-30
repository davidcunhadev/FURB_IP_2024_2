import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        /*
         Uma loja de calçados está concedendo 12% de desconto nos produtos. 
         Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos 
         e quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser
         informado pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:

        O valor do desconto é de R$ xxx
        O preço do par de sapatos com desconto é R$ xxx
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        int valorDoProduto = scanner.nextInt();
        int valorDeDesconto = (valorDoProduto * 12) / 100;
        int valorFinal = valorDoProduto - valorDeDesconto;

        System.out.println("Preço original do produto é R$" + valorDoProduto);
        System.out.println("Preço final do produto com desconto é R$" + valorFinal);
        
        scanner.close();
    }
}
