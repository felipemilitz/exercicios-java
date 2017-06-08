import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        
        double valorA;
        double valorB;
        double valorC;
        double valorX1;
        double valorX2;
        double delta;
        double potencia;
        
        
        System.out.println ("Informe os valores para variáveis");
        System.out.print ("ValorA: ");
        valorA = leia.nextDouble ();
        
        System.out.print ("ValorB: ");
        valorB = leia.nextDouble ();
        
        System.out.print ("ValorC: ");
        valorC = leia.nextDouble ();
        
        
        potencia = Math.pow (valorB,2);
        
        delta = (potencia-4*valorA*valorC);
        
        valorX1 = ((-valorB+delta*0.5)/(2*valorA));
        
        valorX2 = ((-valorB-delta*0.5)/(2*valorA));
        
        
        System.out.println ("Segue abaixos os valores");
        System.out.println ("Valor do X1: "+valorX1);
        System.out.println ("Valor do X2: "+valorX2);
        
    }
    
}
