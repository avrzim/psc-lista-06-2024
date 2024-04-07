import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int contadorPar = 0;
        int contadorImpar = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o número " + i + ":");
            numeros[i] = input.nextInt();
        }
        
        for(int i = 0; i < numeros.length; i++){
            if( numeros[i] % 2 == 0){
                par[contadorPar] = numeros[i];
                contadorPar++;
            } else{
                impar[contadorImpar] = numeros[i];
                contadorImpar++;
            }
        }
        System.out.println("Os números são: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("Os números pares são: ");
        for(int i = 0; i < contadorPar; i++){
            System.out.print(par[i] + " ");
        }
        System.out.println();

        System.out.println("Os números impares são: ");
        for(int i = 0; i < contadorImpar; i++){
            System.out.print(impar[i] + " ");
        }

        input.close();
    }
}