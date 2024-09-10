import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        /*
        O custo do selo de uma carta com até 50 gramas é de R$ 0,45. 
        As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, ou fração, 
        em que excedem aquele peso. 
        Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com peso da carta:");
        Double pesoCartaEmGramas = scanner.nextDouble();
        Double valorPagar = 0.0;

        if (pesoCartaEmGramas <= 50) {
            valorPagar = 0.45;
        } else {
            double pesoExcedido = pesoCartaEmGramas - 50;
            double qtAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * qtAdicional;
        }

        System.out.println("Custo do selo: R$" + valorPagar);

        scanner.close();
    }
}
