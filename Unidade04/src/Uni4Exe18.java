import java.util.Scanner;

public class Uni4Exe18 {
  public static void main(String[] args) {
    /*
    Uma loja que trabalha com crediário funciona da seguinte maneira: 
    se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e 
    é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias após o 
    vencimento, o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias após o vencimento, 
    é cobrada uma multa de 2% por cada dia de atraso. Faça um algoritmo que leia o dia do vencimento, 
    o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, 
    exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês 
    e os clientes nunca deixam para pagar no mês seguinte.
    */

    Scanner scanner = new Scanner(System.in);
    Double totalAPagar = 0.0;

    System.out.println("Digite o dia do vencimento: ");
    Integer diaDoVencimento = scanner.nextInt();

    System.out.println("Digite o dia do pagamento: ");
    Integer diaDoPagamento = scanner.nextInt();

    System.err.println("Digite o valor da prestação: ");
    Integer valorDaPrestacao = scanner.nextInt();

    if (diaDoVencimento >=1 && diaDoVencimento <= 10  && diaDoPagamento <= diaDoVencimento) {
      Double desconto = valorDaPrestacao * 0.10;
      totalAPagar = valorDaPrestacao - desconto;
      System.out.println("O pagamento está em dia! Valor total da prestação com desconto: R$" + totalAPagar);

    } else if (diaDoVencimento >=1 && diaDoVencimento <= 10  && diaDoPagamento > diaDoVencimento && diaDoPagamento <= 15) {
      System.out.println("Voce perdeu o seu desconto! Valor total da prestação: R$" + valorDaPrestacao);

    } else if (diaDoVencimento >= 1 && diaDoVencimento <= 10 && diaDoPagamento > diaDoVencimento && diaDoPagamento >= 16) {
      Integer diasDeAtraso = diaDoPagamento - 15;
      Double jurosAPagar = valorDaPrestacao * 0.02 * diasDeAtraso;
      totalAPagar = jurosAPagar + valorDaPrestacao;
      System.out.println("O pagamento está atrasado! Valor total da prestação com juros: R$" + totalAPagar);

    } else {
      System.out.println("Dia do vencimento não pode ser maior que o dia 10.");
    }

    scanner.close();
  }
}
