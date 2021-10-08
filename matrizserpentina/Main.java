import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fila=sc.nextInt();
        int columna=sc.nextInt();
        int matriz[][]=new int[fila][columna];
        int num=1;
        for(int i=0; i<fila; i++){
            if(i%2==0){
                for(int j=0; j<columna; j++){
                    matriz[i][j]=num;
                    num++;
                }
            }else{
                for(int k=columna-1; k>=0; k--){
                    matriz[i][k]=num;
                    num++;
                }
            }
        }
        for(int i=0; i<fila; i++){
            for(int j=0; j<columna; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}