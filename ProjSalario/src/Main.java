import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        double salarioDoFuncionario;
        double salarioMinimo;
        
        
        System.out.println ("Informe seu Salário");
        System.out.print ("Salário: ");
        salarioDoFuncionario = leia.nextDouble();
        
        
        salarioMinimo = (salarioDoFuncionario/937);
        
     
        System.out.println ("Segue abaixo");
        System.out.println ("Salario Mínimo: "+salarioMinimo);
        
        
    }
    
}
