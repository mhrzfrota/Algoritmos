import java.util.Scanner;

public class Contagem{
    
    public Contagem(){}

    public void Contar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tamano do vetor que deseja:");
        int n=sc.nextInt();
        double[] vetor=new double[n];
        
        for(int x=0;x<n;x++){
            System.out.println("Informe o "+(x+1)+"° elemento do vetor");
            vetor[x]=sc.nextDouble();
        }

        int totalInteiro=0;

        for(int x=0;x<n;x++){
            if((int)vetor[x]==vetor[x]){
                totalInteiro=totalInteiro+1;
            }
        }

        System.out.println("Existem "+totalInteiro+" valor(es) inteiro(s) no vetor");

        sc.close();
        
    }


}