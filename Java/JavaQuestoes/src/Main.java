import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continuar="S";

        while(continuar.equals("S")){

        System.out.println("Insira a operação que gostaria de realizar (escreva 'Opcoes' para ver opcoes):");
        String operacao=input.next();
        
        switch(operacao){
            case "Opcoes":
            System.out.println("Contagem");
            System.out.println("Fibonacci");
            System.out.println("MDC");
            System.out.println("Ordenacao");
            System.out.println("Primo");
            System.out.println("Somatorio");
            break;
            
            case "Contagem":
            Contagem exemplo =new Contagem();
            exemplo.Contar();
            break;

            case "Fibonacci":
            Fibonacci exemplo1=new Fibonacci();
            exemplo1.calcularFibonacci();
            break;

            case "MDC":
            MDC exemplo2=new MDC();
            exemplo2.calcularMDC();
            break;

            case "Ordenacao":
            Ordenacao exemplo3=new Ordenacao();
            exemplo3.OrdenarVetor();
            break;
            
            case "Primo":
            Primo exemplo4=new Primo();
            exemplo4.testarPrimo();
            break;

            case "Somatorio":
            Somatorio exemplo5=new Somatorio();
            exemplo5.realizarSomatorio();
            break;

            default:
            System.out.println("Entrada inválida");
            break;

        }
        Scanner input1 = new Scanner(System.in);
        System.out.println("Deseja realizar uma nova operação? ('S' ou 'N')");
        continuar=input1.next();

        }

        input.close();

        System.out.println("Fim do Programa");
    }
}