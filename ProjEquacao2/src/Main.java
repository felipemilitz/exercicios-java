import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double valorA;
        double valorB;
        double valorC;
        double valorD;
        double valorE;
        double soma;
        double media;
        double produto;
        
        System.out.println ("Informe os dados abaixo");
        System.out.print ("ValorA: ");
        valorA = leia.nextDouble ();
        
        System.out.print ("ValorB: ");
        valorB = leia.nextDouble ();
        
        System.out.print ("ValorC: ");
        valorC = leia.nextDouble ();
        
        System.out.print ("ValorD: ");
        valorD = leia.nextDouble ();
        
        System.out.print ("ValorE: ");
        valorE = leia.nextDouble ();
        
        
        soma = (valorA+valorB+valorC+valorD+valorE);
        
        media = ((valorA+valorB+valorC+valorD+valorE)/5);
        
        produto = (valorA*valorB*valorC*valorD*valorE);
        
        
        
        System.out.println ("Segue abaixo os dados");
        System.out.println ("Soma: "+soma);
        System.out.println ("Média: "+media);
        System.out.println ("Produto: "+produto);
        
             
    }
    
}
