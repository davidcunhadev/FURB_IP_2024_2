import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        /*
        Um restaurante cobra R$ 25,00 por cada quilo de refeição.
        Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) 
        e imprima o valor a pagar. O peso do prato é de 750 gramas.
         */
        
         Scanner scanner = new Scanner(System.in);

         System.out.print("Digite o peso do prato em KG: ");
         double pesoKgPratoCliente = scanner.nextDouble();

         double precoKgRefeicao = 25.00;
         double pesoBasePrato = 0.75;
         
         double pesoTotalPrato = pesoKgPratoCliente - pesoBasePrato;
         double precoFinal = precoKgRefeicao * pesoTotalPrato;

         System.out.println("O valor total a pagar é de R$" + precoFinal);
         
         scanner.close();
    }
}
