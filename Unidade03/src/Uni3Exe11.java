import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        /*
        Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. 
        Fórmula:

        °F = (°C * 9 / 5) + 32
         */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em °C: ");
        int temperaturaEmGraus = scanner.nextInt();

        int temperaturaEmFahrenheit = (temperaturaEmGraus * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é de: " + temperaturaEmFahrenheit + "°F.");

        scanner.close();
    }
}
