import java.util.Scanner;

public class Uni6Exe03 {
  private Uni6Exe03() {
    /*
    Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
    Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. 
    Imprima o vetor resultante. 
    Faça um método para ler os valores, outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor. 
    */
    Scanner scanner = new Scanner(System.in);
    
    double array[] = new double[12];

    valoresLer(array, scanner);

    valoresAjustar(array);

    valoresAtualizadosEscrever(array);

    scanner.close();

  }

  private void valoresLer(double array[], Scanner scanner) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Digite um valor");
      array[i] = scanner.nextDouble();
    }
  }

  private double[] valoresAjustar(double array[]) {
      for (int i = 0; i < array.length; i++) {
        if (i % 2 == 0) {
          array[i]+= array[i] * 0.02;
        } else {
          array[i]+= array[i] * 0.05;
        }
      }

      return array;
  }

  private void valoresAtualizadosEscrever(double updatedArray[]) {
    for (int i = 0; i < updatedArray.length; i++) {
      System.out.println(updatedArray[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe03();
  }
}
