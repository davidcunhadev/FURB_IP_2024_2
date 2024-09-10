import java.util.Scanner;

public class Uni4Exe15 {
  public static void main(String[] args) {
    /*
    Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. 
    A empresa irá conceder 5% de reajuste para o funcionário que for admitido há até de 12 meses. 
    Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. 
    O seu algoritmo deve solicitar ao usuário que digite a quantidade
    de meses que o funcionário foi admitido.
    */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o salário atual do funcionário: ");
    Double salario = scanner.nextDouble();
    Double ajusteSalario = 0.0;

    System.out.println("Digite a quantidade de meses que o funcionário foi admitido: ");
    Integer qtMesesAdmitido = scanner.nextInt();
    
    if (qtMesesAdmitido > 0 && qtMesesAdmitido < 13) {
      ajusteSalario = salario * 0.05;
      salario += ajusteSalario;
    } else if (qtMesesAdmitido >= 13 && qtMesesAdmitido <= 48) {
      ajusteSalario = salario * 0.07;
      salario += ajusteSalario;
    }

    System.out.println("O reajuste foi de R$" + Math.floor(ajusteSalario)  + ". Somando o salário total de: R$" + salario);
    
    scanner.close();
  }
}
