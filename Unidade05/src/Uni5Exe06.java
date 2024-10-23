import java.util.Scanner;

public class Uni5Exe06 {
  public static void main(String[] args) {
    /*
    Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.
    */

     Scanner scanner = new Scanner(System.in);
     Double somaAlturas = 0.0;
     Double mediaAlturas = 0.0;
     
     for (int i = 1; i <= 20; i++) {
      System.out.println("Digite a altura da pessoa " + i + ":");
      Double altura = scanner.nextDouble();
      somaAlturas+= altura;
     }
      mediaAlturas = somaAlturas / 20;
      System.out.println(mediaAlturas);

     scanner.close();
  }
}
