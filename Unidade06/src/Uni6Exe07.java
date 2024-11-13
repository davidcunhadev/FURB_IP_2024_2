import java.util.Scanner;

public class Uni6Exe07 {

  private Uni6Exe07() {
    /*
    Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo inteiro. 
    Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. 
    Esse número deverá ser armazenado no vetor caso ainda não exista, e se o valor já existir deve ser pedido um novo valor. 
    Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser adicionado. 
    Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. 
    Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo:

    Vetor origem: [0][4][2][6][3]
    Vetor ordenado: [0][2][3][4][6]

    Crie um método para inserir os valores no vetor, outro para ordenar o vetor e outro para informar o vetor resultante. 
    */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o tamanho do array: ");
    int tamanhoVetor = scanner.nextInt();
    
    while ((tamanhoVetor > 20)) {
      System.out.println("O tamanho limite máximo do vetor é de 20 posições!");
      System.out.println("Digite o tamanho do array: ");
      tamanhoVetor = scanner.nextInt();
    }

    int array[] = new int[tamanhoVetor];

    lerValoresUnicos(scanner, array);

    ordenarArrayCrescente(array);

    valoresEscrever(array);

    scanner.close();

  }

  private void lerValoresUnicos(Scanner scanner, int[] array) {
    int i = 0;
    while (i < array.length) {
      System.out.println("Digite o valor para a posição " + i + ": ");
      int valor = scanner.nextInt();
      
      boolean duplicado = false;
      for (int j = 0; j < i; j++) {
        if (array[j] == valor) {
          duplicado = true;
          break;
        }
      }

      if (!duplicado) {
        array[i] = valor;
        i++;
      } else {
        System.out.println("O valor inserido já existe. Por favor, digite um valor diferente.");
      }
    }
  }

  private void ordenarArrayCrescente(int array[]) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }

  private void valoresEscrever(int array[]) {
    System.out.println("Vetor ordenado: ");
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
  public static void main(String[] args) {
    new Uni6Exe07();
  }
}
