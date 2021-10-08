import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int origen, destino;
        int matrizadyacencia[][]=new int[10][10];
        for(int i=0; i<n; i++){
            origen=sc.nextInt();
            destino=sc.nextInt();
            matrizadyacencia[origen][destino]=1;
            matrizadyacencia[destino][origen]=1;
        }
        int consulta=sc.nextInt();
        for(int i=0; i<10; i++){
            if(matrizadyacencia[consulta][i]==1){
                System.out.print(i+" ");
            }
        }
    }
}