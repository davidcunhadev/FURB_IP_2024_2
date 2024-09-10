import java.util.Scanner;

public class Uni4Exe27 {
  public static void main(String[] args) {
    /*
    As tarifas de um estacionamento são as seguintes:

    1° e 2° hora - R$ 5,00 cada
    3° e 4° hora - R$ 7,50 cada
    5° hora e seguintes - R$ 10,00 cada 

    O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo 
    dependendo do tempo. Até 29 minutos depois da chegada, arredonda-se para baixo e 
    após 30 minutos arredonda-se para cima. Por exemplo, quem estacionar durante 1 hora e 15 minutos 
    pagará por 1 hora e quem estacionar por 1 hora e 35 minutos pagará por duas horas. 
    Entretanto, se a pessoa permaneceu menos de 30 minutos, também pagará por uma hora. 
    Os horários de chegada e partida são apresentados na forma de pares de inteiros, 
    representando horas e minutos. Por exemplo, o par 12 50 representará meio dia e cinquenta. 
    Assim, faça um algoritmo que leia os horários de chegada e de partida e escreva na tela o 
    tempo que ficou estacionado, e o preço a ser cobrado. Deverá haver validação de dados. 
    Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas, e sempre 
    chegam e saem no mesmo dia.
    */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a hora da chegada: ");
    Integer horaChegada = scanner.nextInt();

    System.out.println("Digite os minutos da chegada: ");
    Integer minChegada = scanner.nextInt();

    System.out.println("Digite a hora da saída: ");
    Integer horaSaida = scanner.nextInt();
    
    System.out.println("Digite os minutos da saída: ");
    Integer minSaida = scanner.nextInt();

    Double valorAPagar = 0.0;

    Integer tempoEstacionadoEmHoras = horaSaida - horaChegada;
    Integer tempoEstacionadoEmMinutos = minSaida - minChegada;

    if (horaChegada < 0 || horaChegada >= 24 || horaSaida < 0 || horaSaida >= 24) {
      System.out.println("O formato das horas só pode ser 00h-23h.");
    }
    
    if (minChegada < 0 || minChegada >= 60 || minSaida < 0 || minSaida >= 60) {
      System.out.println("O formato dos minutos só pode ser 01min-59min.");
    }

    if (tempoEstacionadoEmHoras < 0) {
      tempoEstacionadoEmHoras = Math.abs(horaSaida - horaChegada + 24);
    }

    if (tempoEstacionadoEmMinutos < 0) {
      tempoEstacionadoEmMinutos = Math.abs(minSaida - minChegada + 60);
    }

    if (tempoEstacionadoEmMinutos > 29) {
      valorAPagar+= 5.0;
    }

    switch (tempoEstacionadoEmHoras) {
      case 0:
      case 1:
      case 2:
        valorAPagar = 5.0 * tempoEstacionadoEmHoras;
        if (tempoEstacionadoEmMinutos < 29 && tempoEstacionadoEmHoras == 0) {
          valorAPagar+= 5.0;
        }
        break;
      
      case 3:
      case 4:
        valorAPagar+= 7.50 * tempoEstacionadoEmHoras;
        break;

      default:
        valorAPagar+= 10.0 * tempoEstacionadoEmHoras;
    }

    System.out.println("Preço cobrado = R$" + valorAPagar);

    scanner.close();
  }
}
