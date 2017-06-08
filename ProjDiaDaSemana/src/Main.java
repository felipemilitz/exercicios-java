import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int numero;
        String dia;
        
        System.out.print ("Informe um número inteiro: ");
        numero = leia.nextInt();
        
        if (numero==1){
            dia = "Domingo";
        }else if (numero==2){
            dia = "Segunda-Feira";
        }else if (numero==3){
            dia= "Terça-Feira";
        }else if (numero==4){
            dia = "Quarta-Feira";
        }else if (numero==5){
            dia = "Quinta-Feira";
        }else if (numero==6){
            dia = "Sexta-Feira";
        }else{
            dia = "Sábado";
        }
        
        System.out.println ("O número é "+numero+" e o dia da semana é "+dia);

    }
    
}
