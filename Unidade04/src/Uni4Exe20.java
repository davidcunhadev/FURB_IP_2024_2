import java.util.Locale;
import java.util.Scanner;

public class Uni4Exe20 {
  public static void main(String[] args) {
    /*
    Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, 
    descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:
    
    media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;

    A atribuição dos conceitos obedece à tabela abaixo:

    media	conceito
    >= 9.0 | A
    >= 7.5 e < 9.0 |	B
    >= 6.0 e < 7.5 |	C
    >= 4.0 e < 6.0 |	D
    < 4.0 |	E
    
    O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a 
    mensagem "aprovado" caso o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.
    */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    Double notaProva1 = scanner.nextDouble();

    System.out.println("Digite a segunda nota: ");
    Double notaProva2 = scanner.nextDouble();

    System.out.println("Digite a terceira nota: ");
    Double notaProva3 = scanner.nextDouble();

    System.out.println("Digite a média dos exercícios: ");
    Double notaExercicios = scanner.nextDouble();

    Double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;

    if (media >= 9.0) {
      System.out.println("Média de aproveitamento: " + String.format(Locale.US ,"%.2f", media) + " Nota A -> Aprovado");
    } else if (media >= 7.5) {
      System.out.println("Média de aproveitamento: " + String.format(Locale.US ,"%.2f", media) + " Nota B -> Aprovado");
    } else if (media >= 6.0) {
      System.out.println("Média de aproveitamento: " + String.format(Locale.US ,"%.2f", media) + " Nota C -> Aprovado");
    } else if (media >= 4.0) {
      System.out.println("Média de aproveitamento: " + String.format(Locale.US ,"%.2f", media) + " Nota D -> Reprovado");
    } else {
      System.out.println("Média de aproveitamento: " + String.format(Locale.US ,"%.2f", media) + " Nota E -> Reprovado");
    }

    scanner.close();
  }
}
