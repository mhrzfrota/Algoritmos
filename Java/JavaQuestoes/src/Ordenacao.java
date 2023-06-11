import java.util.Scanner;

public class Ordenacao{

    public Ordenacao(){
    }

    public void OrdenarVetor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira quantos elementos tera o vetor: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array ordenado: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low; j<=high-1; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}