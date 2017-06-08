import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int valor;
        double soma;
        
        System.out.println ("Informe um valor para ser triplicado");
        System.out.print ("Valor: ");
        valor = leia.nextInt ();
        
        
        soma =Math.pow(valor,3);
        
        
        System.out.println ("Segue abaixo o cálculo");
        System.out.println ("Valor: "+valor);
        System.out.println ("O triplo é: "+soma);
        
        
    }
    
}
