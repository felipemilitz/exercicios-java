import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
      String nome;
      double meta;
      double comissao;
      double totalVendido;
      double valorVendidoMeta;
      
      System.out.println("Informe os dados do vendedor !!!");
      
      System.out.print("Informe o nome do vendedor: ");
      nome = leia.next();
      
      System.out.print("Informe sua meta atual: ");
      meta = leia.nextDouble();
      
      System.out.print("Informe total vendido: ");
      totalVendido = leia.nextDouble();
      
      valorVendidoMeta = meta-totalVendido;
              
      if (valorVendidoMeta<0.5){
          comissao = totalVendido*0.01;
      }else if ((valorVendidoMeta>=0.5)||(meta<=0.75)){
          comissao = totalVendido*0.025;
      }else if (valorVendidoMeta<=1){
          comissao = totalVendido*0.035;
      }else{
          comissao = valorVendidoMeta*0.05;
      }
      
      System.out.println("Nome do funcionario: " +nome);      
      System.out.println("Meta do vendedor: " + meta);
      System.out.println("Comissão: "+valorVendidoMeta);
        
    }
    
}
