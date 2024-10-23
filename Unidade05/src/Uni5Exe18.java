import java.util.Scanner;

public class Uni5Exe18 {
  public static void main(String[] args) {
    /*
    Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, em um certo dia do mês. 
    Na pesquisa foi utilizado um coletor de dados portátil. 
    Para cada casa visitada, foi fornecido o número do canal (4, 5, 9, 12) e o número de pessoas que estavam assistindo a TV naquele horário, 
    considerando que em cada casa só existia uma televisão. 
    Em casas onde a televisão estava desligada, foi registrado zero para o número do canal e para o número de pessoas. 
    Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora, o percentual de audiência. 
    A leitura deve ser finalizada quando for informado canal 0. 
    */

    Scanner scanner = new Scanner(System.in);

    int totalPessoas = 0;
    int pessoasCanal4 = 0, pessoasCanal5 = 0, pessoasCanal9 = 0, pessoasCanal12 = 0;

    int canal, pessoas;

    while (true) {
        System.out.print("Digite o número do canal (4, 5, 9, 12) ou 0 para encerrar: ");
        canal = scanner.nextInt();

        if (canal == 0) {
            break;
        }

        System.out.print("Digite o número de pessoas assistindo: ");
        pessoas = scanner.nextInt();

        totalPessoas += pessoas;

        switch (canal) {
            case 4:
                pessoasCanal4 += pessoas;
                break;
            case 5:
                pessoasCanal5 += pessoas;
                break;
            case 9:
                pessoasCanal9 += pessoas;
                break;
            case 12:
                pessoasCanal12 += pessoas;
                break;
            default:
                System.out.println("Canal inválido. Informe um canal entre 4, 5, 9 ou 12.");
                break;
        }
    }

    double percentualCanal4 = (totalPessoas > 0) ? (double) pessoasCanal4 / totalPessoas * 100 : 0;
    double percentualCanal5 = (totalPessoas > 0) ? (double) pessoasCanal5 / totalPessoas * 100 : 0;
    double percentualCanal9 = (totalPessoas > 0) ? (double) pessoasCanal9 / totalPessoas * 100 : 0;
    double percentualCanal12 = (totalPessoas > 0) ? (double) pessoasCanal12 / totalPessoas * 100 : 0;

    System.out.println("\nPercentual de audiência por canal:");
    System.out.printf("Canal 4: %.2f%%\n", percentualCanal4);
    System.out.printf("Canal 5: %.2f%%\n", percentualCanal5);
    System.out.printf("Canal 9: %.2f%%\n", percentualCanal9);
    System.out.printf("Canal 12: %.2f%%\n", percentualCanal12);

    scanner.close();
  }
}
