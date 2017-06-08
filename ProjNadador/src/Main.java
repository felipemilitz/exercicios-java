import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String nome;
        int idade;
        String classificacao;
        
        System.out.println("Informe seus dados!!!");
        
        System.out.print("Digite o seu nome: ");
        nome =  leia.next();
        
        System.out.print("Digite a sua idade: ");
        idade = leia.nextInt();
        
        if ((idade>=8)&&(idade<=10)){
            classificacao = "Infantil";
        }else if (idade<=17){
            classificacao = "Juvenil";
        }else if (idade<=49){
            classificacao = "Adulto";
        }else if (idade<=60){
            classificacao = "Terceira Idade";
        }else{
            classificacao = "não pode ser nadador,mínimo 8 e máximo 60";
        }
        
        System.out.println ("Abaixo segue os dados do Nadador");
        System.out.println ("Nome: "+nome);
        System.out.println ("Idade: "+idade);
        System.out.println ("E sua classificação é "+classificacao);
        
    }
    
}
