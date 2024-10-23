public class Uni5Exe02 {
  public static void main(String[] args) {
    /* Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.*/

    int par = 0;
    int impar = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        par = par + i;
      } else {
        impar = impar + i;
      }
    }

    System.out.println("A soma dos números pares entre 1 e 100 é de: " + par);
    System.out.println("A soma dos números ímpares entre 1 e 100 é de: " + impar);
  }
}
