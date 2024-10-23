public class Uni5Exe03 {
  public static void main(String[] args) {
    /*
     Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
     1/1 + 1/2 + 1/3 + 1/4 + ... 1/100
     */

    double resultado = 0;
    double denominador = 1;

    for (int i = 1; i <= 100; i++) {
      resultado+= 1 / denominador;
      denominador+= 1;
    }

    System.out.println("A soma da série de 100 termos é de: " + String.format("%.2f", resultado));
  }
}
