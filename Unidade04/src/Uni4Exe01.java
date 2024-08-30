import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        /*
        A jornada de trabalho semanal de um funcionário é de 40 horas. 
        O funcionário que trabalhar mais de 40 horas receberá hora extra,
        cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
        Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
        o valor por hora e escreva o salário total do funcionário, que deverá ser 
        acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês 
        possua 4 semanas exatas).
         */

        Scanner scanner = new Scanner(System.in);

        double salarioTotal;
        
        System.out.println("Digite o número de horas trabalhadas no mes: ");
        int horasTrabalhadasNoMes = scanner.nextInt();

        System.out.println("Digite o valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        if (horasTrabalhadasNoMes > 160) {
            int horasExtras = horasTrabalhadasNoMes - 160;
            double valorMonetarioEmHorasExtras = horasExtras * (valorPorHora * 1.5);
            salarioTotal = valorMonetarioEmHorasExtras + (horasTrabalhadasNoMes * valorPorHora);
            System.out.println("O salário total é: " + salarioTotal);
        }

        if (horasTrabalhadasNoMes <= 160) {
            salarioTotal = horasTrabalhadasNoMes * valorPorHora;

            System.out.println("O salário total é: " + salarioTotal);
        }

        scanner.close();
    }
}
