import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        /*
        Descreva um programa que a partir da distância percorrida e do tempo gasto por um motorista
        durante uma viagem de final de semana, calcule a velocidade média e a quantidade de combustível
        gasto na viagem, sabendo que o automóvel faz 12 km por litro.
         */

         Scanner scanner = new Scanner(System.in);

         System.out.print("Digite a distância (em KM) percorrida pelo automóvel: ");
         double distanciaPercorrida = scanner.nextDouble();

         System.out.print("Digite o tempo (em horas) de viagem gasto: ");
         double tempoDeViagem = scanner.nextDouble();

         double velocidadeMedia = distanciaPercorrida / tempoDeViagem;
         double combustivelGasto = distanciaPercorrida / 12;

         System.out.println("A velocidade média da viagem foi de " + velocidadeMedia + "km/h.");
         System.out.println("Foram gastos " + combustivelGasto + " litros de combustível na viagem.");
         
         scanner.close();
    }
}
