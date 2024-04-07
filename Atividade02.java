import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] NumReal = new double[10];

        for(int i = 0; i < NumReal.length; i++){
            System.out.print("Digite o número: ");
            NumReal[i] = input.nextDouble();
        }

        System.out.println("Os números com a sequência ao contrário: ");

        for(int i = 9; i >= 0; i--){ 
            System.out.println( NumReal[i]);
        }

        input.close();
    }
}