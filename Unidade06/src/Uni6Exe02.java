import java.util.Scanner;

public class Uni6Exe02 {
  private Uni6Exe02() {
    /*
     Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
     Imprima quais valores desses informados são maiores que a média dos valores. Faça um método para ler os valores, 
     outro para calcular a média e outro para informar os valores maiores que a média.
     */

    Scanner scanner = new Scanner(System.in);
    
    double array[] = new double[12];
    double media = 0;

    valorLer(array, scanner);

    media = valorCalcularMedia(array, media);

    media = media / array.length;

    valoresMaiorQueMedia(array, media);

    scanner.close();
  }

  private void valorLer(double array[], Scanner scanner) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Digite um valor");
      array[i] = scanner.nextDouble();
    }
  }

  private double valorCalcularMedia(double array[], double media) {
    for (int i = 0; i < array.length; i++) {
      media+= array[i];
    }
    return media;
  }

  private void valoresMaiorQueMedia(double array[], double media) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] > media) {
        System.out.println("Valores maiores que a média: " + array[i]);
      }
    }
  }
  
  public static void main(String[] args) {
    new Uni6Exe02();
  }
}
