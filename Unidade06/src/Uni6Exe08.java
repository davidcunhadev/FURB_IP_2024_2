import java.util.Scanner;

public class Uni6Exe08 {

  private Uni6Exe08() {
    /*
    Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo real. 
    Faça o usuário informar valores para as posições deste vetor e coloque-as nas posições na sequência informada pelo usuário. 
    Imprima uma tabela contendo cada valor diferente e o número de vezes que o valor aparece no vetor. 
    */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o tamanho do array: ");
    int tamanhoVetor = scanner.nextInt();
    
    while ((tamanhoVetor > 20)) {
      System.out.println("O tamanho limite máximo do vetor é de 20 posições!");
      System.out.println("Digite o tamanho do array: ");
      tamanhoVetor = scanner.nextInt();
    }

    double array[] = new double[tamanhoVetor];

    lerArray(scanner, array);

    int frequenciaNumerosArray[] = contadorFrequenciaDeNumerosDoArray(array);

    imprimirTabela(frequenciaNumerosArray, array);

    scanner.close();
  }

  private void lerArray(Scanner scanner, double array[]) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Digite o valor para a posição " + i + ": ");
      array[i] = scanner.nextDouble();
    }
  }

  private int[] contadorFrequenciaDeNumerosDoArray(double array[]) {
    int contadorRepeticao[] = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      int contador = 0;
      for (int j = 0; j < array.length; j++) {
        if (array[j] == array[i]) {
          contador++;
        }
      }
      contadorRepeticao[i] = contador;
    }

    return contadorRepeticao;
  }

  private void imprimirTabela(int arrayContador[], double array[]) {
    System.out.println("VALOR || FREQUENCIA");

    boolean[] exibido = new boolean[array.length];

    for (int i = 0; i < array.length; i++) {
      if (!exibido[i]) {
        System.out.println(array[i] + "   ||   " + arrayContador[i]);
        for (int j = i + 1; j < array.length; j++) {
          if (array[j] == array[i]) {
            exibido[j] = true;
          }
        }
      }
    }
  }
  public static void main(String[] args) {
    new Uni6Exe08();
  }
}
