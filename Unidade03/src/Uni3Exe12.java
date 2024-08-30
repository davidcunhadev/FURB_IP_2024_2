import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        /*
        Uma empresa tem para um funcionário os seguintes dados: 
        o nome, o número de horas trabalhadas mensais e o número de dependentes. 
        A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) 
        e R$ 60,00 por dependente (valor para cálculo do salário família) 
        e são feitos descontos de 8,5% sobre o salário trabalho para o INSS 
        e de 5% sobre o salário trabalho para o imposto de renda. 
        Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String funcionarioNome = scanner.nextLine();

        System.out.println("Digite o número de pessoas dependentes do funcionário: ");
        int funcionarioNumeroDependentes = scanner.nextInt();

        System.out.println("Digite o número de horas trabalhadas: ");
        int funcionarioHorasTrabalhadas = scanner.nextInt();

        double valorHora = 10.00;
        double valorPorDependente = 60.00;
        double impostoINSS = 0.085;
        double impostoIR = 0.05;

        double salarioTrabalho = valorHora * funcionarioHorasTrabalhadas;
        double salarioFamilia = funcionarioNumeroDependentes * valorPorDependente;
        double salarioBruto = salarioTrabalho + salarioFamilia;
        double descontoINSS = salarioTrabalho * impostoINSS;
        double descontoIR = salarioTrabalho * impostoIR;
        double salarioLiquido = salarioBruto - (descontoINSS + descontoIR);

        System.out.println("O funcionário de nome " + funcionarioNome + " tem de salário bruto: R$" + salarioBruto + " e de salário líquido: R$" + salarioLiquido);

        scanner.close();
    }
}
