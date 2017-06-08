import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        String nomeDoVendedor;
        double totalVendido;
        double meta;
        double acimaDaMeta;
        double comissao;
        
        
        System.out.println ("######Informe os dados do vendedor#######");
        System.out.println ("Nome: ");
        nomeDoVendedor = leia.next();
        
        System.out.println ("Total das Vendas: ");
        totalVendido = leia.nextDouble();
        
        System.out.println ("Meta a atingir: ");
        meta = leia.nextDouble();
        
        acimaDaMeta = totalVendido-meta/100;
        
        if (acimaDaMeta<50){
            comissao = totalVendido*0.01;
        }else if (acimaDaMeta<=75){
            comissao = totalVendido*0.025;
        }else if (acimaDaMeta<=100){
            comissao = totalVendido*0.035;
        }else{
            comissao = totalVendido*0.05;
        }
        
        System.out.println ("Abaixo segue os dados do Vendedor");
        System.out.println ("Nome: "+nomeDoVendedor);
        System.out.println ("Meta a atingir: "+meta);
        System.out.println ("Comissão a receber R$: "+comissao);
    }
    
}
