import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        double custoDaFabrica;
        double custoDoConsumidor;
        
        
        System.out.println ("Informe os dados do carro");
        System.out.print ("O Custo da Fábrica: ");
        custoDaFabrica = leia.nextDouble();
        
        
        custoDoConsumidor = (custoDaFabrica*1.73);
        
        System.out.println ("O custo do carro pro Consumidor é: "+custoDoConsumidor);
    }
    
}
