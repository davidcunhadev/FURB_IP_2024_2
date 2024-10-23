public class Uni5Exe04 {
  public static void main(String[] args) {
    /*
    Descreva um algoritmo para calcular o valor de S dado por:
    S = 3/2 + 5/6 + 7/12 + 9/20 + 11/30 + ...
     */

     double resultado = 0;
     double numerador = 3;
     double denominador = 2;

     for (int i = 1; i <= 20; i++) {      
      denominador = i * (i + 1);
      resultado += numerador / denominador;
      
      numerador += 2;
     }

     System.out.println("A soma da série de 20 termos é de: " + String.format("%.2f", resultado));
    }
}
