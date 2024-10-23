import java.util.Scanner;

public class Uni5Exe13 {
  public static void main(String[] args) {
    /*
    Um motorista acaba de voltar de um feriado prolongado. 
    Antes de sair de viagem e imediatamente após retornar, o motorista encheu o tanque do veículo e registrou as medidas do odômetro. 
    Em cada parada feita durante a viagem, foi registrado o valor do odômetro e a quantidade de combustível comprado para 
    reabastecer o veículo (suponha que o tanque foi enchido a cada parada). 
    Descreva um algoritmo que leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustível. 
    Calcule e escreva:
    a quilometragem obtida por litro de combustível em cada parada;
    a quilometragem média obtida por litro de combustível em toda a viagem.
    */

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número total de reabastecimentos: ");
    int numReabastecimentos = scanner.nextInt();

    double odometroInicial, odometroAnterior, odometroAtual;
    double combustivelComprado, kmPorLitro;
    double totalQuilometragem = 0;
    double totalCombustivel = 0;

    System.out.print("Digite o valor do odômetro antes da viagem: ");
    odometroInicial = scanner.nextDouble();
    odometroAnterior = odometroInicial;

    for (int i = 1; i <= numReabastecimentos; i++) {
        System.out.println("\nReabastecimento " + i + ":");

        System.out.print("Digite o valor do odômetro no reabastecimento: ");
        odometroAtual = scanner.nextDouble();

        System.out.print("Digite a quantidade de combustível comprada (em litros): ");
        combustivelComprado = scanner.nextDouble();

        double quilometragem = odometroAtual - odometroAnterior;
        kmPorLitro = quilometragem / combustivelComprado;

        System.out.printf("Quilometragem obtida por litro neste trecho: %.2f km/l\n", kmPorLitro);

        totalQuilometragem += quilometragem;
        totalCombustivel += combustivelComprado;

        odometroAnterior = odometroAtual;
    }

    double mediaKmPorLitro = totalQuilometragem / totalCombustivel;

    System.out.printf("\nQuilometragem média obtida por litro em toda a viagem: %.2f km/l\n", mediaKmPorLitro);

    scanner.close();
  }
}
