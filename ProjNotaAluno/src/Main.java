
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double n1;
        double n2;
        double media;
        double frequencia;
        String nome;
        String situacao;

        System.out.println("Nome: ");
        nome = leia.next();

        System.out.print("Digita nota 1: ");
        n1 = leia.nextDouble();

        System.out.print("Digite nota 2: ");
        n2 = leia.nextDouble();
        
        System.out.print ("Frequência: ");
        frequencia = leia.nextDouble();
        

        media = (n1 + n2) / 2;

        if ((media >= 6) && (frequencia >= 75)) {
            situacao = "Aluno Aprovado";
        } else if ((media < 6) && (frequencia >= 75)) {
            situacao = "Aluno aprovado por frequência e reprovado por média ";
        } else if ((media >= 6) && (frequencia < 75)) {
            situacao = "Aluno aprovado por média e reprovado por frequência ";
        } else {
            situacao = "Aluno reprovado!!!";
        }

        System.out.println("Nome do aluno: " + nome);

        System.out.println("Nota 1 do aluno: " + n1);

        System.out.println("Nota 2 do aluno: " + n2);

        System.out.println("Frequência: "+frequencia);
        
        System.out.println("Média  do aluno: "+media);
        
        System.out.println("O aluno está "+situacao);
        
        

    }
}
