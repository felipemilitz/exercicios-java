import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int op;
        String resposta;
        
        do{
        System.out.println ("1 - Mostrar Salário Bruto");
        System.out.println ("2 - Mostrar Valor de horas extras");
        System.out.println ("3  - Mostrar Valor do VT");
        System.out.println ("4 - Mostrar Valor do INSS");
        System.out.println ("5 - Mostrar Valor da Insalubridade");
        System.out.println ("6 - Mostrar Valor  do Salário Família");
        System.out.println ("7 - Mostrar Valor do plano de carreira");
        System.out.println ("8 - Mostrar Valor  total de plano de saúde");
        System.out.println ("9 - Mostrar Valor do Salário Líquido");
        System.out.println ("10 - Cadastrar novo funcionário");
        System.out.println ("0- Sair do sistema");
        
        
        op = leia.nextInt ();
        
        
        switch  (op){
            case 1:
                resposta = "O salário é: R$ 1000";
                break;
            case 2:
                resposta = "O valor hora é R$: 10";
                break;
            case 3:
                resposta = "O valor do vale transporte é: R$ 60";
                break;
            case 4:
                resposta = "O valor do INSS é: R$ 110";
                break;
            case 5:
                resposta = "O valor da Insalubridade é: R$ 400";
                break;
            case 6:
                resposta = "O valor do Salário Família é: $ 350";
                break;
            case 7:
                resposta = "O valor do Plano de carreira é: R$ 500";
                break;
            case 8:
                resposta = "O valor do Plano de saúde é: R$ 600";
                break;
            case 9:
                resposta = "O valor do Salário Líquido é: R$ 800";
                break;
            case 10:
                resposta = "10	Funcionário cadastrado";
                break;
            default:
                resposta = "";
        }
        System.out.println ("");
        System.out.println ("");
        System.out.println ("");
        System.out.println (""+resposta);
        System.out.println ("");
        System.out.println ("");
        System.out.println ("");
        
        
        
        }while((op>=1)&&(op<=10));
                
    }
    
}
