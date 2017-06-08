import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        double precoLitroCombustivel;
        double kmPorLitro;
        double distancia;
        double mediaLitroKm;
        double gastoTotal;
        
        System.out.println ("Informe os dados da viagem desejada");
        System.out.print ("Preço do Litro do Combustível: ");
        precoLitroCombustivel = leia.nextDouble ();
        
        System.out.print ("Quantos Quilômetros por Litro o carro faz: ");
        kmPorLitro = leia.nextDouble ();
        
        System.out.print ("Qual á Distância a percorrer: ");
        distancia = leia.nextDouble ();
        
        
        
        mediaLitroKm = (distancia/kmPorLitro);
        
        gastoTotal = (mediaLitroKm*precoLitroCombustivel);
        
        
        System.out.println ("Segue abaixo as informações necessária para viagem");
        System.out.println ("Á média do carro: "+mediaLitroKm);
        System.out.println ("E o Custo da viagem em relação ao Combustível: "+gastoTotal);
        
        
    }
    
}
