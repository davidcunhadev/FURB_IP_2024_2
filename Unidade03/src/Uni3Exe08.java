import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        /*
        Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
        Para isto ela entregou um valor em dólares para o atendente. 
        Considerando que o atendente tem a cotação do dólar, 
        descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa.
         */

        Scanner scanner = new Scanner(System.in);

        double cotacaoDolar = 5.41;

        System.out.println("Digite quantos dólares você quer trocar: ");
        double valorEntradaEmDolar = scanner.nextDouble();

        double totalEmReais = cotacaoDolar * valorEntradaEmDolar;
        
        System.out.println("O valor em reais a ser devolvido é de R$" + totalEmReais);
        
        scanner.close();
    }
}
