import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        
        int anoAtual;
        int anoDeNascimento;
        int idadeAtual;
        int idadeEm2020;
        
        
        System.out.println ("Informe os anos");
        System.out.print ("Ano de Nascimento: ");
        anoDeNascimento = leia.nextInt ();
        
        System.out.print ("Ano atual: ");
        anoAtual = leia.nextInt ();
        
        
        idadeAtual = (anoAtual-anoDeNascimento);
        
        idadeEm2020 = (2020-anoDeNascimento);
        
        System.out.println ("Segue abaixo");
        System.out.println ("Sua idade atual: "+idadeAtual);
        System.out.println ("Sua idade em 2020: "+idadeEm2020);
    }
               
    
}
