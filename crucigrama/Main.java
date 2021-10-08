import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String A;
        String B;
        Scanner sc=new Scanner(System.in);
        A=sc.next();
        B=sc.next();
        char []a=A.toCharArray();
        char []b=B.toCharArray();
        int fila=0, columna=0;
        boolean encontrado=false;
        char coincidencia=' ';
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    columna=i;
                    fila=j;
                    encontrado=true;
                    coincidencia=a[i];
                    break;
                }
            }
            if(encontrado){
                break;
            }
        }
        int f=0;
        int s=0;
        for(int i=0; i<b.length; i++){
            for(int j=0; j<a.length; j++){
                if(i==fila && j==columna){
                    System.out.print(coincidencia);
                    f++;
                    s++;
                }else if(i==fila){
                    System.out.print(A.charAt(f));
                    f++;
                }else if(j==columna){
                    System.out.print(B.charAt(s));
                    s++;
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }


    }
}