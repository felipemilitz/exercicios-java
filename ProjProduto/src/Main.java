import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Produto objProduto = new Produto();
        
        System.out.println("\n\nInforme os dados");
        System.out.print("Nome: ");
        objProduto.setNome(leia.next());
        System.out.print("Descriçao: ");
        objProduto.setDescricao(leia.next());
        System.out.print("Quantidade: ");
        objProduto.setQuantidade(leia.nextInt());
        System.out.print("valor unitario: ");
        objProduto.setvalorUnitario(leia.nextDouble());
    
        
        System.out.println("Nome: "+objProduto.getNome());
        System.out.println("Descriçao: "+objProduto.getDescricao());
        System.out.println("Quantidade: "+objProduto.getQuantidade());
        System.out.println("Valor unitario: "+ objProduto.getvalorUnitario());
        System.out.println("Resultado valor total: "+objProduto.getvalorTotal());

    }
}
