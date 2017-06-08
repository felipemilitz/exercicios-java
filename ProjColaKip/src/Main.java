import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        
        int lata;
        int refri600;
        int refri2L;
        double totalDeLitros;
        double totalVendidos;
        
        
        System.out.println ("Informe o total vendido de:");
        System.out.println ("Refri em Lata: ");
        lata = leia.nextInt ();
        
        System.out.print ("Refri 600ml: ");
        refri600 = leia.nextInt ();
        
        System.out.print ("Refri de 2 Litros: ");
        refri2L = leia.nextInt ();
        
        totalDeLitros = (lata*0.35+refri600*0.6+refri2L*2);
        
        totalVendidos = (lata*1.2+refri600*1.8+refri2L*2.8);
        
        System.out.println ("A empresa conseguiu:");
        System.out.println ("Um Total de Litros vendidos de: "+totalDeLitros);
        System.out.println ("E um total de vendas no valor de RS "+totalVendidos);
    }
    
}
