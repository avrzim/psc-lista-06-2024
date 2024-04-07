import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] alunos = new String[10];
        double[] media = new double[10]; 
        double[] notas = new double[4];
        int maiorMedia;

        maiorMedia = 0;

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Digite o nome do aluno: ");
            alunos[i] = input.nextLine();

            for(int j = 0; j < 4; j++){
                System.out.println("Digite a nota " + (j + 1) + " do aluno " + alunos[i] + ": ");
                notas[j] = input.nextDouble();
            }
            input.close();

            media[i] = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        }
        for(int i = 0; i < media.length; i++){
            if(media[i] >= 7){
                maiorMedia++;
            }
        }

        System.out.print("O número de alunos com média maior ou igual a 7 é: " + maiorMedia);

        input.close();
    }
}