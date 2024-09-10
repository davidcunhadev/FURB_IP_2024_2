import java.util.Scanner;

public class Uni4Exe11 {
  public static void main(String[] args) {
    /*
    Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, 
    escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. 
    Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, 
    e apenas irmãos se todas as idades forem diferentes.
    */

    Scanner scanner = new Scanner(System.in);
    final int anoAtual = 2024;

    System.out.println("Digite o ano de nascimento do primeiro irmão: ");
    int anoNascIrmao1 = scanner.nextInt();

    System.out.println("Digite o ano de nascimento do segundo irmão: ");
    int anoNascIrmao2 = scanner.nextInt();

    System.out.println("Digite o ano de nascimento do terceiro irmão: ");
    int anoNascIrmao3 = scanner.nextInt();

    int idadeIrmao1 = anoAtual - anoNascIrmao1;
    int idadeIrmao2 = anoAtual - anoNascIrmao2;
    int idadeIrmao3 = anoAtual - anoNascIrmao3;

    if (idadeIrmao1 == idadeIrmao2 && idadeIrmao2 == idadeIrmao3) {
      System.out.println("TRIGÊMEOS");
    } else if (idadeIrmao1 == idadeIrmao2 || idadeIrmao1 == idadeIrmao3 || idadeIrmao2 == idadeIrmao3) {
      System.out.println("GÊMEOS");
    } else {
      System.out.println("APENAS IRMÃOS");
    }

    scanner.close();
  }
}
