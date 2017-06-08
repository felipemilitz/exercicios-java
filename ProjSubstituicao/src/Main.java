import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int valorA;
        int valorB;
        int valorC;
        int baude;
        
        System.out.println ("Informe 3 variáveis");
        System.out.print ("ValorA: ");
        valorA = leia.nextInt ();
        
        System.out.print ("ValorB: ");
        valorB = leia.nextInt ();
        
        System.out.print ("ValorC: ");
        valorC = leia.nextInt ();
        
        baude = valorA;
        valorA = valorB;
        valorB = valorC;
        valorC = baude;
             
        
        System.out.println ("Segue abaixo");
        System.out.println ("ValorA: "+valorA);
        System.out.println ("ValorB: "+valorB);
        System.out.println ("ValorC: "+valorC);
        
    }
    
}
