import java.util.Scanner;

public class Uni6Exe09 {

  private Uni6Exe09() {
    /*
    Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. 
    Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), 
    uma nota para o cinema (zero até dez, valor inteiro) e a idade.

    Baseado nisto faça um programa que informe:

    qual a nota média recebida pelo cinema;
    qual a nota média atribuída pelos homens;
    qual a nota atribuída pela mulher mais jovem;
    quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema. 
    */

    Scanner scanner = new Scanner(System.in);

    int totalPessoas = 30;

    int sexo[] = new int[totalPessoas];
    int nota[] = new int[totalPessoas];
    int idade[] = new int[totalPessoas];

    double mediaNotaGeral = 0;
    double mediaNotaHomens = 0;
    int totalHomens = 0;
    int idadeMulherMaisJovem = Integer.MAX_VALUE;
    int notaMulherMaisJovem = 0;
    int mulheresComMaisDe50AnosNotaAcimaMedia = 0;

    coletarInfos(scanner, sexo, nota, idade, totalPessoas, totalPessoas, mulheresComMaisDe50AnosNotaAcimaMedia, totalHomens, idadeMulherMaisJovem, notaMulherMaisJovem);

    mediaNotaGeral = mediaNotaGeral / totalPessoas;
    mediaNotaHomens = totalHomens > 0 ? mediaNotaHomens / totalHomens : 0;

    infosMulheresComMaisDe50AnosNotaAcimaMedia(sexo, idade, nota, notaMulherMaisJovem, totalPessoas, mulheresComMaisDe50AnosNotaAcimaMedia);

    imprimirInfos(mediaNotaGeral, mediaNotaHomens, notaMulherMaisJovem, mulheresComMaisDe50AnosNotaAcimaMedia);

    scanner.close();
  }

  private void coletarInfos(Scanner scanner, int[] sexo, int[] nota, int[] idade, int totalPessoas, int mediaNotaHomens, int mediaNotaGeral, int totalHomens, int idadeMulherMaisJovem, int notaMulherMaisJovem) {
    for (int i = 0; i < totalPessoas; i++) {
      System.out.println("Digite o sexo da pessoa " + i + ". Ex:(1 = FEMININO) | (2 = MASCULINO)");
      sexo[i] = scanner.nextInt();

      System.out.println("Digite a nota da pessoa " + i + " para o cinema.");
      nota[i] = scanner.nextInt();

      System.out.println("Digite a idade da pessoa " + i + ".");
      idade[i] = scanner.nextInt();

      mediaNotaGeral+= nota[i];

      if (sexo[i] == 2) {
        mediaNotaHomens += nota[i];
        totalHomens++;
      }

      if (sexo[i] == 1 && idade[i] < idadeMulherMaisJovem) {
        idadeMulherMaisJovem = idade[i];
        notaMulherMaisJovem = nota[i];
      }
    }
  }

  private void infosMulheresComMaisDe50AnosNotaAcimaMedia(int[] sexo, int[] idade, int[] nota, int mediaNotaGeral, int totalPessoas, int mulheresComMaisDe50AnosNotaAcimaMedia) {
    for (int i = 0; i < totalPessoas; i++) {
      if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaNotaGeral) {
        mulheresComMaisDe50AnosNotaAcimaMedia++;
      }
    }
  }

  private void imprimirInfos(double mediaNotaGeral, double mediaNotaHomens, int notaMulherMaisJovem, int mulheresComMaisDe50AnosNotaAcimaMedia) {
    System.out.println("A nota média recebida pelo cinema foi: " + mediaNotaGeral);
    System.out.println("A nota média atribuída pelos homens foi: " + mediaNotaHomens);
    System.out.println("A nota atribuída pela mulher mais jovem foi: " + notaMulherMaisJovem);
    System.out.println("O total de mulheres com mais de 50 anos que deram nota superior a média foi: " + mulheresComMaisDe50AnosNotaAcimaMedia);
  }
  public static void main(String[] args) {
    new Uni6Exe09();
  }
}
