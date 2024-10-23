import java.util.Scanner;

public class Uni5Exe15 {
  public static void main(String[] args) {
    /*
    Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. 
    Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”. 
    */

    Scanner scanner = new Scanner(System.in);

    String nome;
    double nota1, nota2, media;

    while (true) {
        System.out.print("Digite o nome do aluno (ou 'fim' para encerrar): ");
        nome = scanner.nextLine();

        if (nome.equalsIgnoreCase("fim")) {
            break;
        }

        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        
        scanner.nextLine();

        media = (nota1 + nota2) / 2;

        System.out.printf("A média do aluno %s é: %.2f\n\n", nome, media);
    }

    scanner.close();
  }
}
