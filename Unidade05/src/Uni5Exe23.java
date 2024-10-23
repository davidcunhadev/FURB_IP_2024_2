import java.util.Scanner;

public class Uni5Exe23 {
  public static void main(String[] args) {
    /*
    Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, 
    que é igual a 30% de comissão sobre o preço de cada produto vendido. 
    Cada vendedor, em um determinado mês, vende n produtos, onde, para cada produto tem-se o preço unitário e a quantidade vendida. 
    O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário de cada vendedor. 
    Descreva um algoritmo que gere o relatório desejado. 
    Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: 
    “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. 

    O número de produtos (n) de cada vendedor deve ser informado. 
    */

    Scanner scanner = new Scanner(System.in);

    String nomeVendedor;
    double totalVendas;
    double salario;
    char continuar = 's';

    while (continuar == 's' || continuar == 'S') {
        totalVendas = 0;

        System.out.print("Digite o nome do vendedor: ");
        nomeVendedor = scanner.nextLine();

        System.out.print("Digite o número de produtos vendidos: ");
        int n = scanner.nextInt();

        int i = 0;
        while (i < n) {
            System.out.print("Digite o preço unitário do produto " + (i + 1) + ": R$ ");
            double precoUnitario = scanner.nextDouble();
            System.out.print("Digite a quantidade vendida do produto " + (i + 1) + ": ");
            int quantidadeVendida = scanner.nextInt();

            totalVendas += precoUnitario * quantidadeVendida;

            i++;
        }

        salario = totalVendas * 0.30;

        System.out.printf("\nRelatório do Vendedor: %s\n", nomeVendedor);
        System.out.printf("Total de Vendas: R$ %.2f\n", totalVendas);
        System.out.printf("Salário: R$ %.2f\n", salario);

        System.out.print("\nDeseja digitar os dados de mais um vendedor? (s/n): ");
        continuar = scanner.next().charAt(0);
        scanner.nextLine();
    }

    scanner.close();
  }
}
