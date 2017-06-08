import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        String nomeDaPessoa;
        String sexo;
        double situacao;
        int idade;
        double altura;
        
        
        System.out.println ("Informe os dados abaixo");
        System.out.print ("Nome: ");
        nomeDaPessoa = leia.next ();
        
        System.out.print ("Sexo: ");
        sexo = leia.next ();
        
        System.out.print ("Idade: ");
        idade = leia.nextInt ();
        
        System.out.print ("Altura: ");
        altura = leia.nextDouble ();
        
       
        if (sexo.equalsIgnoreCase("Masculino")){
            situacao = 72.7*altura-58;
        }else if (sexo.equalsIgnoreCase("Feminino")){
            situacao = 62.1*altura-44.7; 
        }else{
            situacao = 0;
            sexo = "Inválido";
        }
        
        
        System.out.println ("Segue os dados abaixo");
        System.out.println ("O peso ideal é "+situacao);
        }
    
}
