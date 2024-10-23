import java.util.Scanner;

public class Uni5Exe09 {
  public static void main(String[] args) {
    /*
    Uma turma tem n alunos. Dado n, o nome e idade de cada aluno, descreva um algoritmo que:
    - escreva os nomes dos alunos que têm 18 anos;
    - escreva a quantidade de alunos que têm idade acima de 20 anos.
    */

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o número de alunos da sala: ");
    int numeroLoop = scanner.nextInt();
    scanner.nextLine();

    int qtdeAlunosAcimaDe20Anos = 0;
    String alunos18Anos = "";
    
    for (int i = 1; i <= numeroLoop; i++) {
      System.out.println("Digite o nome do Aluno " + i + ":");
      String nomeAluno = scanner.nextLine();

      System.out.println("Digite a idade do aluno:");
      int idadeAluno = scanner.nextInt();
      scanner.nextLine();

      if (idadeAluno == 18) {
        alunos18Anos += nomeAluno + "\n";
      }

      if (idadeAluno > 20) {
        qtdeAlunosAcimaDe20Anos++;
      }
    }

    if (!alunos18Anos.isEmpty()) {
      System.out.println("Alunos com 18 anos: " + alunos18Anos);
    } else {
      System.out.println("Nenhum aluno tem 18 anos.");
    }

    System.out.println("O total de alunos acima de 20 anos é: " + qtdeAlunosAcimaDe20Anos + ".");

    scanner.close();
  }
}
