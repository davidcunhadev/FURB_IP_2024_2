import java.util.Scanner;

public class Uni5Exe14 {
  public static void main(String[] args) {
    /*
    Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. 
    Para cada mercadoria ele tem o nome, o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

    escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), 
    onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;

    determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total. 
    */

    Scanner scanner = new Scanner(System.in);

    int lucroMenor10 = 0;
    int lucroEntre10e20 = 0;
    int lucroMaior20 = 0;

    double totalCompra = 0;
    double totalVenda = 0;
    double lucroTotal = 0;

    for (int i = 1; i <= 2; i++) {
        System.out.println("\nMercadoria " + i + ":");

        System.out.print("Nome da mercadoria: ");
        String nome = scanner.next();

        System.out.print("Preço de compra (PC): ");
        double precoCompra = scanner.nextDouble();
        System.out.print("Preço de venda (PV): ");
        double precoVenda = scanner.nextDouble();

        double lucroPercentual = (precoVenda - precoCompra) / precoCompra * 100;

        totalCompra += precoCompra;
        totalVenda += precoVenda;

        lucroTotal += (precoVenda - precoCompra);

        if (lucroPercentual < 10) {
            lucroMenor10++;
        } else if (lucroPercentual <= 20) {
            lucroEntre10e20++;
        } else {
            lucroMaior20++;
        }
    }

    System.out.println("Mercadorias com lucro < 10%: " + lucroMenor10);
    System.out.println("Mercadorias com 10% <= lucro <= 20%: " + lucroEntre10e20);
    System.out.println("Mercadorias com lucro > 20%: " + lucroMaior20);
    System.out.printf("Valor total de compra: R$ %.2f\n", totalCompra);
    System.out.printf("Valor total de venda: R$ %.2f\n", totalVenda);
    System.out.printf("Lucro total: R$ %.2f\n", lucroTotal);

    scanner.close();
  }
}
