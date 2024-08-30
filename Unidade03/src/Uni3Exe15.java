import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        /*
        Construa um programa para ler um número inteiro (assuma até 3 dígitos) 
        e imprima a saída da seguinte forma:

        X centena(s)  Y dezena(s) K unidade(s)

        Exemplo, se for submetido o número 384, o programa deverá exibir:

        3 centena(s)  8 dezena(s) 4 unidade(s)  
         */

         Scanner scanner = new Scanner(System.in);
         int centena, dezena, unidade;

         System.out.println("Digite um número inteiro: ");
         int numero = scanner.nextInt();

         centena = numero / 100;
         numero %= 100;

         dezena = numero / 10;
         numero %= 10;

         unidade = numero;

         System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s).");

         scanner.close();
    }
}
