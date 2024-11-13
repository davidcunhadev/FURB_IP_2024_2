import java.util.Scanner;

public class Uni6Exe04 {

  private Uni6Exe04() {
    /*
    Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
    Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. 
    Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. 
    Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para escrever os vetores. 
    */

    int array1[] = new int[3];
    int array2[] = new int[3];

    Scanner scanner = new Scanner(System.in);

    valoresLer(array1, array2, scanner);

    int array3[] = valoresSomarArrays(array1, array2);

    valoresEscrever(array1, array2, array3);

    scanner.close();
  }

    private void valoresLer(int array1[], int array2[], Scanner scanner) {
    for (int i = 0; i < array1.length; i++) {
      System.out.println("Digite um valor para o array 1:");
      array1[i] = scanner.nextInt();
    }
    for (int i = 0; i < array2.length; i++) {
      System.out.println("Digite um valor para o array 2:");
      array2[i] = scanner.nextInt();
    }
  }

    private int[] valoresSomarArrays(int array1[], int array2[]) {
      int array3[] = new int[3];
      for (int i = 0; i < array3.length; i++) {
        array3[i] = array1[i] + array2[i];
      }

      return array3;
    }

    private void valoresEscrever(int array1[], int array2[], int array3[]) {
      System.out.println("Vetor 1: ");
      for (int i = 0; i < array1.length; i++) {
        System.out.println(array1[i] + " ");
      }
      System.out.println("Vetor 2: ");
      for (int i = 0; i < array2.length; i++) {
        System.out.println(array2[i] + " ");
      }
      System.out.println("Vetor 3: ");
      for (int i = 0; i < array3.length; i++) {
        System.out.println(array3[i] + " ");
      }
    }
  public static void main(String[] args) {
    new Uni6Exe04();
  }
}
