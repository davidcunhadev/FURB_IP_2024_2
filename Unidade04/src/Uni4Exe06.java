import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia um caractere. 
        Caso seja digitada a letra 'M' escreva “Masculino”. 
        Se for digitada a letra 'F' escreva “Feminino”. 
        Se for informado 'I' escreva “Não Informado”. 
        Qualquer outra letra digitada escreva “Entrada Incorreta”. 
        Atenção: antes de testar a letra, converta-a para maiúscula.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um caractere (M), (F) ou (I): ");
        String caractere = scanner.nextLine().toUpperCase();

        if (caractere.equals("M")) {
            System.out.println("Masculino");
        }
         else if (caractere.equals("F")) {
            System.out.println("Feminino");
        }
        else if (caractere.equals("I")) {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada Incorreta");
        }

        scanner.close();
    }
}
