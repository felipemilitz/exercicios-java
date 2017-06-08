import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        
        double pesoDaPessoa;
        double engordou;
        double emagreceu;
        
        
        System.out.println ("Informe seu peso atual");
        System.out.print ("Peso: ");
        pesoDaPessoa = leia.nextDouble();
        
        engordou = (pesoDaPessoa*1.15);
        
        emagreceu = (pesoDaPessoa*0.8);
        
        System.out.println ("Se a pessoa engordar 15% do seu peso atual ela ficaria com :"+engordou);
        System.out.println ("Se a pessoa emagrecer 20% do seu peso atual ela ficaria com: "+emagreceu);
    }
    
}
