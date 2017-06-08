import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
        
        String nome;
        int numero;
        double valor;
        boolean teste;
        
        System.out.println("Informe os dados");
        System.out.print("Nome: ");
        nome = leia.next();
        
        System.out.print("Número: ");
        numero = leia.nextInt();
        
        System.out.print("Valor: ");
        valor = leia.nextDouble();
        
        System.out.print("Teste: ");
        teste = leia.nextBoolean();
        
        System.out.println("Dados das variáveis");
        System.out.println("Nome: "+nome);
        System.out.println("Número: "+numero);
        System.out.println("Valor: "+valor);
        System.out.println("Teste: "+teste);
        
        
        
        
        
        
        
        
        
    }
}
