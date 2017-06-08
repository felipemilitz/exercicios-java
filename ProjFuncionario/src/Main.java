import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        double salarioFixo;
        double valorDasVendas;
        double salarioFinal;
        double comissao;
        
        
        System.out.println ("Informe os dados do Funcionário");
        System.out.print ("Salário Fixo: ");
        salarioFixo = leia.nextDouble();
        
        System.out.print ("Valor Total das Vendas: ");
        valorDasVendas = leia.nextDouble ();
        
        
        comissao = (valorDasVendas*0.04);
        
        salarioFinal = (salarioFixo+comissao);
        
        
        System.out.println ("Segue abaixo os valores");
        System.out.println ("Comissão recebida: "+comissao);
        System.out.println ("Salário à Receber: "+salarioFinal);
        
        
                
                
    }
    
}
