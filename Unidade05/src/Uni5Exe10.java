public class Uni5Exe10 {
  public static void main(String[] args) {
    /*
    O número 3025 possui a seguinte característica:

    30 + 25 = 55 -> 55² = 3025

    Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. Outros exemplos:
    20 + 25 = 45 -> 45² = 2025
    */

    int encontrados = 0;

    for (int numero = 1; encontrados < 10; numero++) {
        int parte1 = numero / 100;
        int parte2 = numero % 100;

        int soma = parte1 + parte2;
        int quadradoSoma = soma * soma;

        if (quadradoSoma == numero) {
            System.out.println(numero);
            encontrados++;
        }
    }
  }
}
