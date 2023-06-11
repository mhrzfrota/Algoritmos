import java.util.Scanner;
import java.util.*;

public class CamisaPolo {
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        List<Camisa> lista= new ArrayList<Camisa>();
        
        int entrada=sc.nextInt();
        while(entrada>0){
            lista.clear();
            for (int n=0;n<entrada;n++){
                sc.nextLine();
                Camisa estudante=new Camisa(sc.nextLine(),sc.next(),sc.next().charAt(0));
                lista.add(estudante);
            }
            Collections.sort(lista);
            Camisa placeHolder;
            Iterator<Camisa> itr=lista.iterator();
            while(itr.hasNext()){
                placeHolder=itr.next();
                System.out.println(placeHolder.getCor() +" "+ placeHolder.getTamanho() +" "+placeHolder.getComprador());
            }
            entrada=sc.nextInt();
            if(entrada>0){
                System.out.println();
            }
        }
        
        sc.close();
    }

}

class Camisa implements Comparable<Camisa>{
    private String cor;
    private char tamanho;
    private String comprador;
    
    public Camisa(String comprador ,String cor, char tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.comprador = comprador;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public char getTamanho() {
        return tamanho;
    }
    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    public String getComprador() {
        return comprador;
    }
    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public int compareTo(Camisa camisa) {
        int comparacao=this.cor.compareTo(camisa.getCor());
        if(comparacao==0){
            comparacao=this.tamanho+camisa.getTamanho();
            if(comparacao==0){
                comparacao=this.comprador.compareTo(camisa.getComprador());
            }
        }
        return comparacao;
      }

}