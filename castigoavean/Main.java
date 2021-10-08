import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fila=sc.nextInt();
        int columna=sc.nextInt();
        int [][]matriz=new int[fila][columna];
        int mayor=0;
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                matriz[i][j]=sc.nextInt();
                if(mayor<matriz[i][j]){
                    mayor=matriz[i][j];
                }
            }
        }
        int arreglo[]=new int[mayor+1];
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                arreglo[matriz[i][j]]++;
            }
        }
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i]!=0){
                System.out.print(arreglo[i]+" ");
            }
        }



    }
}