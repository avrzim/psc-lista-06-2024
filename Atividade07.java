import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma, multiplicacao;

        soma = 0;
        multiplicacao = 1;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i + 1) + " número:");
            numeros[i] = input.nextInt();
        }

        for(int i = 0; i < numeros.length;i++){
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("Os números são:");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A multiplicação dos números é: " + multiplicacao);

        input.close();
    }
}