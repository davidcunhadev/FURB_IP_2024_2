import java.util.Scanner;

public class Uni5Exe25 {
  public static void main(String[] args) {
    /*
    Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, e E, 
    ponto para o jogador do lado esquerdo da mesa. Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. 
    A partida encerra quando:

    um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
    o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, caso a primeira condição não seja atendida. 
    */

    Scanner scanner = new Scanner(System.in);

    int pontosDireito = 0;
    int pontosEsquerdo = 0;
    char jogada;

    while (true) {
        System.out.print("Digite o código do ponto (D para direito, E para esquerdo): ");
        jogada = scanner.next().charAt(0);

        if (jogada == 'D' || jogada == 'd') {
            pontosDireito++;
        } else if (jogada == 'E' || jogada == 'e') {
            pontosEsquerdo++;
        } else {
            System.out.println("Código inválido! Use D ou E.");
            continue;
        }

        if (pontosDireito >= 21 || pontosEsquerdo >= 21) {
            if (Math.abs(pontosDireito - pontosEsquerdo) >= 2) {
                break;
            }
        }
    }

    if (pontosDireito > pontosEsquerdo) {
        System.out.println("Vencedor: Jogador do lado direito com " + pontosDireito + " pontos.");
    } else {
        System.out.println("Vencedor: Jogador do lado esquerdo com " + pontosEsquerdo + " pontos.");
    }

    scanner.close();
  }
}
