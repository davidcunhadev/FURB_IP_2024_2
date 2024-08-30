import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler três notas de um aluno em uma disciplina e imprimira
        sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
         */

         Scanner scanner = new Scanner(System.in);

         System.out.println("Digite a primeira nota do aluno: ");
         double nota1 = scanner.nextDouble();
         System.out.println("Digite a segunda nota do aluno: ");
         double nota2 = scanner.nextDouble();
         System.out.println("Digite a terceira nota do aluno: ");
         double nota3 = scanner.nextDouble();

         double media = (nota1 * 0.5 + nota2 * 0.3 + nota3 * 0.2) / 3;

         System.out.println("A média final do aluno é: " + media);

         scanner.close();
    }
}
