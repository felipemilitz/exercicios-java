import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        double salarioBase;
        double salarioAReceber;
        
        
        
        System.out.println ("Informe os dados do Funcionário");
        System.out.print ("Salário Base: ");
        salarioBase = leia.nextDouble();
        
        salarioAReceber = (salarioBase*1.05)*0.93;
        
       
        System.out.println ("Segue abaixo");
        System.out.println ("Salario à receber: "+salarioAReceber);
        
    }
    
}
