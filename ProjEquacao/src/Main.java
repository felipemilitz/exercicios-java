import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        double valorA;
        double valorB;
        double valorC;
        double resultado;
        
        System.out.println ("Informe os dados abaixo");
        System.out.print ("ValorA: ");
        valorA = leia.nextDouble();
        
        System.out.print("ValorB: ");
        valorB = leia.nextDouble();
        
        System.out.print ("ValorC: ");
        valorC = leia.nextDouble();
        
        
        resultado = ((valorA+valorB)*(valorB+valorC));
        
        System.out.println ("Segue abaixos o resultado");
        System.out.println ("ValorA: "+valorA);
        System.out.println ("ValorB: "+valorB);
        System.out.println ("ValorC: "+valorC);
        System.out.println ("O resultado: "+resultado);
               
    }
    
}
