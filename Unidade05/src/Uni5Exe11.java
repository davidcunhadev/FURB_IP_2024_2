public class Uni5Exe11 {
  public static void main(String[] args) {
    /*
    Uma máquina de biscoito está com problemas. 
    Quando ligada, após 1 hora ela quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos,
    na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, 
    e assim por diante. 
    Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia (a máquina opera 16 horas por dia).
    */
    
    int biscoitosQuebrados = 0;
    int quebradosNaHora = 1;

    for (int hora = 1; hora <= 16; hora++) {
        biscoitosQuebrados += quebradosNaHora;

        if (hora > 1) {
            quebradosNaHora *= 3;
        }

        System.out.println("Hora " + hora + ": " + quebradosNaHora + " biscoitos quebrados.");
    }

    System.out.println("Total de biscoitos quebrados em 16 horas: " + biscoitosQuebrados);
  }
}
