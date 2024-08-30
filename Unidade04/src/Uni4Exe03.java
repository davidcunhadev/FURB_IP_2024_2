import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        /*
        Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Entre com o segundo valor: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }

        scanner.close();
    }
}
