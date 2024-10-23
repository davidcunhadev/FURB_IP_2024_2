import java.util.Scanner;

public class Uni5Exe19 {
  public static void main(String[] args) {
    /*
    Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada. 
    O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. 
    Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. 
    Informe também o valor total recebido pela loja ao final do dia. 
    A leitura deve ser finalizada com a leitura 0 para o valor da compra. 
    */

    Scanner scanner = new Scanner(System.in);

    double totalRecebido = 0;
    
    double valorCompra;

    while (true) {
        System.out.print("Digite o valor da compra (ou 0 para encerrar): ");
        valorCompra = scanner.nextDouble();

        if (valorCompra == 0) {
            break;
        }

        double totalPagar;

        if (valorCompra > 500) {
            totalPagar = valorCompra * 0.80; 
        } else {
            totalPagar = valorCompra * 0.85;
        }

        totalRecebido += totalPagar;

        System.out.printf("Total a pagar: R$ %.2f\n", totalPagar);
    }

    System.out.printf("\nTotal recebido pela loja ao final do dia: R$ %.2f\n", totalRecebido);

    scanner.close();
  }
}
