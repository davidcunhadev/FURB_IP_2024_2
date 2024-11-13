import java.util.Scanner;

public class Uni6Exe05 {

  private Uni6Exe05() {
    /*
     * Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça
     * cada um respondeu um questionário com 5 perguntas, como por exemplo:
     * 
     * Gosta de música sertaneja?
     * Gosta de futebol?
     * Gosta de seriados?
     * Gosta de redes sociais?
     * Gosta da Oktoberfest?
     * 
     * A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice
     * de afinidade é medido da seguinte maneira:
     * 
     * se ambos deram a mesma resposta soma-se 3 pontos ao índice;
     * se um respondeu IND e o outro SIM ou NÃO soma-se 1;
     * se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
     * 
     * Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as
     * respostas da moça.
     * Crie um método que possa ler tanto as respostas do rapaz como da moça, e
     * outro para calcular e retornar a afinidade.
     * Por fim, escreva a afinidade considerando os seguintes intervalos:
     * 
     * Afinidade Mensagem
     * 15 “Casem!
     * 10 a 14 “Vocês têm muita coisa em comum!”
     * 5 a 9 “Talvez não dê certo :(”
     * 0 a 4 “Vale um encontro.”
     * -1 a -9 “Melhor não perder tempo”
     * -10 “Vocês se odeiam!”
     */

    Scanner scanner = new Scanner(System.in);

    String perguntas[] = {
        "Gosta de música sertaneja?",
        "Gosta de futebol?", "Gosta de seriados?",
        "Gosta de redes sociais?", "Gosta da Oktoberfest?"
    };

    String respostasRapaz[] = new String[5];
    String respostasMoça[] = new String[5];

    System.out.println("Respostas garoto");
    lerRespostas(perguntas, respostasRapaz, scanner);

    System.out.println("Respostas garota");
    lerRespostas(perguntas, respostasMoça, scanner);

    int totalPontosAfinidade = calcularAfinidade(respostasRapaz, respostasMoça);

    if (totalPontosAfinidade == 15) {
      System.out.println("Casem!");
    } else if (totalPontosAfinidade >= 10) {
      System.out.println("Vocês têm muita coisa em comum!");
    } else if (totalPontosAfinidade >= 5) {
      System.out.println("Talvez não dê certo :(");
    } else if (totalPontosAfinidade >= 0) {
      System.out.println("Vale um encontro.");
    } else if (totalPontosAfinidade >= -9) {
      System.out.println("Melhor não perder tempo");
    } else {
      System.out.println("Vocês se odeiam!");
    }

    scanner.close();
  }

  private void lerRespostas(String perguntas[], String respostasRapaz[], Scanner scanner) {
    for (int i = 0; i < perguntas.length; i++) {
      System.out.println(perguntas[i]);
      String resposta = scanner.nextLine().toUpperCase().trim();
      switch (resposta) {
        case "SIM":
          respostasRapaz[i] = resposta;
          break;

        case "NÃO":
        case "NAO":
          respostasRapaz[i] = resposta;
          break;

        case "IND":
          respostasRapaz[i] = resposta;
          break;

        default:
          System.out.println("Resposta inválida, somente SIM, NÃO ou IND");
          return;
      }
    }
  }

  private int calcularAfinidade(String respostasRapaz[], String respostasMoça[]) {
    int totalPontosAfinidade = 0;

    for (int i = 0; i < respostasRapaz.length; i++) {
      if (respostasRapaz[i].equals(respostasMoça[i])) {
        totalPontosAfinidade += 3;
      } else if (respostasRapaz[i].equals("ind") &&
          (respostasMoça[i].equals("sim") || respostasMoça[i].equals("nao") || respostasMoça[i].equals("não"))) {
        totalPontosAfinidade += 1;
      } else if (respostasMoça[i].equals("ind") &&
          (respostasRapaz[i].equals("sim") || respostasRapaz[i].equals("nao") || respostasRapaz[i].equals("não"))) {
        totalPontosAfinidade += 1;
      } else {
        totalPontosAfinidade -= 2;
      }
    }

    return totalPontosAfinidade;
  }

  public static void main(String[] args) {
    new Uni6Exe05();
  }
}
