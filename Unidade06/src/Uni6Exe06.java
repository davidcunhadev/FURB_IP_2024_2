import java.util.Scanner;

public class Uni6Exe06 {

  private Uni6Exe06() {
    /*
     * Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real.
     * Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor.
     * Após ter preenchido o vetor, solicite que o usuário informe um outro valor real.
     * Informe para o usuário se este valor informado se encontra cadastrado no vetor.
     * Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.
     */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o tamanho do array: ");
    int tamanhoVetor = scanner.nextInt();

    double array[] = new double[tamanhoVetor];

    lerTamanhoDoArray(scanner, array);

    System.out.println("Digite outro número para conferir se o mesmo já existe dentro do array anterior:");
    int numeroASerVerificado = scanner.nextInt();

    verificaSeNumeroInclusoNoArray(array, numeroASerVerificado);

    scanner.close();
  }

  private void lerTamanhoDoArray(Scanner scanner, double array[]) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Digite o valor para a posição " + i + ": ");
      array[i] = scanner.nextInt();
    }
  }

  private void verificaSeNumeroInclusoNoArray(double array[], int numeroASerVerificado) {
    boolean numeroEncontrado = false;

    for (int i = 0; i < array.length; i++) {
      if (array[i] == numeroASerVerificado) {
        numeroEncontrado = true;
        break;
      }
    }
    
    if (numeroEncontrado) {
      System.out.println("O número " + numeroASerVerificado + " está incluso no array.");
    } else {
        System.out.println("O número " + numeroASerVerificado + " não está incluso no array.");
    }
  }

  public static void main(String[] args) {
    new Uni6Exe06();
  }
}
