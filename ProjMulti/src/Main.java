import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int valor1;
        int valor2;
        int soma;
        
        System.out.println ("Informe os dados abaixo");
        System.out.print ("ValorA: ");
        valor1 = leia.nextInt ();
        
        System.out.print ("ValorB: ");
        valor2 = leia.nextInt ();
        
        
        soma = (valor1*valor2);
        
        System.out.println ("Segue abaixo");
        System.out.println ("ValorA: "+valor1);
        System.out.println ("ValorB: "+valor2);
        System.out.println ("A Multiplicação dos valores acima: "+soma);
        
    }
    
}
