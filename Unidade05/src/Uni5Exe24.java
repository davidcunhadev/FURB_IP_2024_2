import java.util.Scanner;

public class Uni5Exe24 {
  public static void main(String[] args) {
    /*
    Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. 
    Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) de cada peixe e escreva o peso total da 
    pesca obtido até aquele ponto. Quando o limite diário for excedido escreva uma mensagem e encerre a execução do algoritmo. 
    Para prosseguir com a entrada de dados de pesos de cada peixe o algoritmo deve apresentar a seguinte mensagem: 
    “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”. 
    */

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o limite diário de pesca (em kg): ");
    double limiteDiario = scanner.nextDouble() * 1000;

    double pesoTotal = 0;
    char continuar = 's';

    while (continuar == 's' || continuar == 'S') {
        System.out.print("Digite o peso do peixe (em gramas): ");
        double pesoPeixe = scanner.nextDouble();

        pesoTotal += pesoPeixe;

        if (pesoTotal > limiteDiario) {
            System.out.println("Limite diário excedido! Peso total da pesca: " + pesoTotal + " gramas.");
            break;
        }

        System.out.printf("Peso total da pesca até agora: %.2f gramas.\n", pesoTotal);

        System.out.print("Deseja informar o peso de mais um peixe? (s/n): ");
        continuar = scanner.next().charAt(0);
        scanner.nextLine();
    }

    if (pesoTotal <= limiteDiario) {
        System.out.printf("Peso total final da pesca: %.2f gramas.\n", pesoTotal);
    }

    scanner.close();
  }
}
