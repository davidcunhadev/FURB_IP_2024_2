public class Uni5Exe21 {
  public static void main(String[] args) {
    /*
    Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. 
    Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.
    */

    double alturaChico = 1.50;
        double alturaZe = 1.10;

        double crescimentoChico = 0.02;
        double crescimentoZe = 0.03;

        int anos = 0;

        while (alturaZe <= alturaChico) {
            alturaChico += crescimentoChico;
            alturaZe += crescimentoZe;
            anos++;
        }

        System.out.printf("Serão necessários %d anos para que Zé seja maior que Chico.\n", anos);
  }
}
