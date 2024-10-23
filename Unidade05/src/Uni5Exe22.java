public class Uni5Exe22 {
  public static void main(String[] args) {
    /*
    Um funcionário recebe aumento anual. Em 1995 foi contratado por 2000 reais. Em 1996 recebeu aumento de 1.5%. 
    A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. 
    Faça programa que determine o salário atual do funcionário. 
    */

    double salario = 2000.0;

    double aumentoAnual = 0.015;
    salario += salario * aumentoAnual;

    for (int ano = 1997; ano <= 2024; ano++) {
        aumentoAnual *= 2;
        salario += salario * aumentoAnual; 
    }

    System.out.printf("O salário atual do funcionário é: R$ %.2f\n", salario);
  }
}
