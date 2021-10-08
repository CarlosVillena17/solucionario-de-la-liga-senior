import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String palabra1;
        palabra1=sc.nextLine();
        palabra1=palabra1.toLowerCase();
        char [] palabra2= palabra1.toCharArray();
        char [] reverso=new char[palabra2.length];
        for(int i=0; i<palabra2.length; i++){
            reverso[i]=palabra2[palabra2.length-1-i];
        }
        int cont=0;
        for(int i=0; i<palabra2.length; i++){
            if(reverso[i]==palabra2[i]){
                cont++;
            }
        }
        System.out.println(cont);
    }

}