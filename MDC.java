import java.util.Scanner;

public class MDC{

    public MDC(){
    }
    
    public void calcularMDC(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        int a1=a;
        int b1=b;

        while (b1 != 0) {
            int resto = a1 % b1;
            a1 = b1;
            b1 = resto;
        }
        
        int mdc = a1;

        System.out.println("O máximo divisor comum de " + a + " e " + b + " é " + mdc);

        sc.close();
    }

    
}