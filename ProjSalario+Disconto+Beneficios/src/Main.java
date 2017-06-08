import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        String nomeDoFuncionario;
        double valorTotalPassagem;
        double valorHora;
        double totalDeHorasTrabalhadas;
        double salarioBruto;
        double valeTransporte;
        double insalubridade=0;
        double inss;
        double salarioLiquido;
        int op;
        
        
        System.out.println ("Informe os dados do funcionário");
        System.out.print ("Nome do Funcionário: ");
        nomeDoFuncionario = leia.next ();
        
        System.out.print ("Valor total da Passagem: ");
        valorTotalPassagem = leia.nextDouble ();
        
        System.out.print ("Valor da hora: ");
        valorHora = leia.nextDouble ();
        
        System.out.print ("Total de horas trabalhadas: ");
        totalDeHorasTrabalhadas = leia.nextDouble ();
        
        
        salarioBruto = valorHora*totalDeHorasTrabalhadas;
        
        valeTransporte = salarioBruto*0.06;
        
        if (valeTransporte>valorTotalPassagem){
            valeTransporte = valorTotalPassagem;
        }
        
        do{
        System.out.println ("######## -ESCOLHA O GRAU DE INSALUBRIDADE- #########");
        System.out.println ("1 – Minimo");
        System.out.println ("2 – Médio");
        System.out.println ("3 – Máximo");
        System.out.print ("Digite a sua opção aqui: ");
        op = leia.nextInt ();
        
        switch (op){
            case 1:
                insalubridade = 937*0.1;
                break;
            case 2:
                insalubridade = 937*0.2;
                break;
            case 3:
                insalubridade = 937*0.4;
                break;
            default:
                System.out.println ("");
                System.out.println ("");
                System.out.println ("Opção Inválida");
                System.out.println ("Tente Novamente");
                System.out.println ("");
                System.out.println ("");
        }
        
        
    
        }while((op<=0)||(op>3));
        
        if (salarioBruto<=1959.38){
            inss = salarioBruto*0.08;
        }else if (salarioBruto<=2765.66){
            inss = salarioBruto*0.09;
        }else if (salarioBruto<=5531.31){
            inss = salarioBruto*0.11;
        }else
            inss = 608.44;
        
        salarioLiquido = salarioBruto-valeTransporte-inss+insalubridade;
        
        System.out.println ("Dados dos Funcionário");
        System.out.println ("Nome: "+nomeDoFuncionario);
        System.out.println ("Valor total das Passagem: "+valorTotalPassagem);
        System.out.println ("Valor Hora: "+valorHora);
        System.out.println ("Total de horas Trabalhadas: "+totalDeHorasTrabalhadas);
        System.out.println ("Salário Bruto: "+salarioBruto);
        System.out.println ("Valor do Vale Transporte: "+valeTransporte);
        System.out.println ("Valor da Insalubridade: "+insalubridade);
        System.out.println ("Valor do Desconto do INSS: "+inss);
        System.out.println ("Salário Líquido: "+salarioLiquido);
    
  
    }      
        
}
