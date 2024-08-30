import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        /*
        Uma fábrica de refrigerantes vende seu produto em três formatos:
        lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros.
        Se um comerciante compra uma determinada quantidade de cada formato, 
        faça um programa para calcular quantos litros de refrigerante ele comprou.
         */

        Scanner scanner = new Scanner(System.in);

        double litragemLata = 0.350; 
        double litragemGarrafa600ml = 0.600;
        double litragemGarrafa2L = 2; 

        System.out.println("Digite a quantidade de latas: ");
        int qtdeLatas = scanner.nextInt();


        System.out.println("Digite a quantidade de garrafas de 600ml: ");
        int qtdeGarrafas600ml = scanner.nextInt();

        System.out.println("Digite a quantidade de garrafas de 2L: ");
        int qtdeGarrafas2L = scanner.nextInt();

        double qtdeTotalEmLitros = (qtdeLatas * litragemLata) + (qtdeGarrafas600ml * litragemGarrafa600ml) + (qtdeGarrafas2L * litragemGarrafa2L);

        System.out.println("A quantidade total em litros de todos os refrigerantes é de " + qtdeTotalEmLitros + " litros.");

        scanner.close();
    }
}
