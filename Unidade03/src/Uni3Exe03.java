import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        /*
         Um motorista deseja abastecer seu tanque de combustível.
         Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento
         e exibir quantos litros ele conseguiu colocar no tanque.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do litro da gasolina: ");
        double precoLitroGasolina = scanner.nextDouble();
        System.out.println("Digite o valor do pagamento: ");
        double valorPagamento = scanner.nextDouble();

        double litragemDoTanque = valorPagamento / precoLitroGasolina;

        System.out.println("O motorista colocou " + litragemDoTanque + " litros de gasolina no tanque.");

        scanner.close();
    }
}
