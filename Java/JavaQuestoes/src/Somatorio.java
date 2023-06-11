import java.util.Scanner;
import java.util.Locale; 


public class Somatorio {

    public Somatorio(){
    }

    public void realizarSomatorio(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos numeros deseja somar:");
        int n=sc.nextInt();
        double soma=0;
        for(int x=0;x<n;x++){
            System.out.println("Informe o "+(x+1)+"° numero");
            soma=soma+sc.nextDouble();
        }

        System.out.println("Soma= "+soma);

        sc.close();
    }

}