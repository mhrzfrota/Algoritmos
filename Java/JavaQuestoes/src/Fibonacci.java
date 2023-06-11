import java.util.Scanner;

public class Fibonacci{

    public Fibonacci(){
    }

    public void calcularFibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos numeros da sequencia Fibonacci gostaria de saber:");
        int n = sc.nextInt();
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println(fib[n - 1]);

        sc.close();
  }
}

