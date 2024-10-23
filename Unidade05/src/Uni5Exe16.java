import java.util.Scanner;

public class Uni5Exe16 {
  public static void main(String[] args) {
    /*
    Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura 
    e do gênero (gênero = 'M' ou gênero = 'm' para masculino; gênero = 'F' e gênero = 'f' para feminino ou gênero = 'O' ou gênero = 'o' para outro) 
    de cada pessoa informe a média da altura das mulheres e a média de altura do grupo. 
    A leitura deve ser finalizada ao digitar 0 para a altura. 
    */

    Scanner scanner = new Scanner(System.in);

    double somaAlturaMulheres = 0;
    int contMulheres = 0;
    double somaAlturaGrupo = 0;
    int contGrupo = 0;

    double altura;
    char genero;

    while (true) {
        System.out.print("Digite a altura da pessoa (ou 0 para encerrar): ");
        altura = scanner.nextDouble();

        if (altura == 0) {
            break;
        }

        System.out.print("Digite o gênero da pessoa (M/F/O): ");
        genero = scanner.next().charAt(0);

        somaAlturaGrupo += altura;
        contGrupo++;

        if (genero == 'F' || genero == 'f') {
            somaAlturaMulheres += altura;
            contMulheres++;
        }
    }

    double mediaAlturaMulheres = (contMulheres > 0) ? somaAlturaMulheres / contMulheres : 0;

    double mediaAlturaGrupo = (contGrupo > 0) ? somaAlturaGrupo / contGrupo : 0;

    System.out.printf("\nMédia da altura das mulheres: %.2f metros\n", mediaAlturaMulheres);
    System.out.printf("Média da altura do grupo: %.2f metros\n", mediaAlturaGrupo);

    scanner.close();
  }
}
