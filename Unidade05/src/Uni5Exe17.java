import java.util.Scanner;

public class Uni5Exe17 {
  public static void main(String[] args) {
    /*
    Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:

    o número de inscrição e a altura do atleta mais alto;
    o número de inscrição e a altura do atleta mais baixo;
    a altura média do grupo de atletas.
    A leitura deve ser finalizada ao digitar 0 para o número de inscrição. 
    */

    Scanner scanner = new Scanner(System.in);

    int inscricaoMaisAlto = 0, inscricaoMaisBaixo = 0;
    double alturaMaisAlto = Double.MIN_VALUE, alturaMaisBaixo = Double.MAX_VALUE;
    
    double somaAltura = 0;
    int contAtletas = 0;

    int inscricao;
    double altura;

    while (true) {
        System.out.print("Digite o número de inscrição do atleta (ou 0 para encerrar): ");
        inscricao = scanner.nextInt();

        if (inscricao == 0) {
            break;
        }

        System.out.print("Digite a altura do atleta: ");
        altura = scanner.nextDouble();

        somaAltura += altura;
        contAtletas++;

        if (altura > alturaMaisAlto) {
            alturaMaisAlto = altura;
            inscricaoMaisAlto = inscricao;
        }

        if (altura < alturaMaisBaixo) {
            alturaMaisBaixo = altura;
            inscricaoMaisBaixo = inscricao;
        }
    }

    double alturaMedia = (contAtletas > 0) ? somaAltura / contAtletas : 0;

    if (contAtletas > 0) {
        System.out.printf("\nAtleta mais alto: Inscrição %d com altura %.2f metros\n", inscricaoMaisAlto, alturaMaisAlto);
        System.out.printf("Atleta mais baixo: Inscrição %d com altura %.2f metros\n", inscricaoMaisBaixo, alturaMaisBaixo);
        System.out.printf("Altura média do grupo: %.2f metros\n", alturaMedia);
    } else {
        System.out.println("Nenhum atleta foi registrado.");
    }

    scanner.close();
  }
}
