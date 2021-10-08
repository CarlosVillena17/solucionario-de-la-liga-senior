import java.util.Scanner;

public class Main {
    public static class NodoArbol {
        int dato;
        String nombre;
        NodoArbol hijoIzquierdo;
        NodoArbol hijoDerecho;
        public NodoArbol(int dato, String nombre){
            this.dato=dato;
            this.nombre=nombre;
            this.hijoDerecho=null;
            this.hijoIzquierdo=null;
        }

        public int getDato() {
            return this.dato;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public NodoArbol getHijoIzquierdo() {
            return hijoIzquierdo;
        }

        public void setHijoIzquierdo(NodoArbol hijoIzquierdo) {
            this.hijoIzquierdo = hijoIzquierdo;
        }

        public NodoArbol getHijoDerecho() {
            return hijoDerecho;
        }

        public void setHijoDerecho(NodoArbol hijoDerecho) {
            this.hijoDerecho = hijoDerecho;
        }

        @Override
        public String toString() {
            return "dato: " + dato +
                    "Nombre: " + nombre;
        }
    }

    public static class ArbolBinario{
        NodoArbol raiz;

        public NodoArbol getRaiz() {
            return raiz;
        }

        public void setRaiz(NodoArbol raiz) {
            this.raiz = raiz;
        }

        public ArbolBinario(){
            this.raiz=null;
        }
        public void agregarNodo(int dato, String nom){
            NodoArbol nuevo=new NodoArbol(dato, nom);
            if(raiz==null){
                this.raiz=nuevo;
            }else{
                NodoArbol temp=this.raiz;
                NodoArbol padre;
                while(true){
                    padre=temp;
                    if(dato<temp.getDato()){
                        temp=temp.hijoIzquierdo;
                        if(temp==null){
                            padre.hijoIzquierdo=nuevo;
                            return;
                        }
                    }else{
                        temp=temp.hijoDerecho;
                        if(temp==null){
                            padre.hijoDerecho=nuevo;
                            return;
                        }
                    }

                }
            }
        }

        public boolean isEmpty(){
            return this.raiz==null;
        }
        public void inOrden(NodoArbol r){
            if(r!=null){
                inOrden(r.hijoIzquierdo);
                System.out.print(r.dato+" ");
                inOrden(r.hijoDerecho);
            }
        }
        public void preOrden(NodoArbol r){
            if(r!=null){
                System.out.print(r.dato+" ");
                preOrden(r.hijoIzquierdo);
                preOrden(r.hijoDerecho);
            }
        }
        public void postOrden(NodoArbol r){
            if(r!=null){
                postOrden(r.hijoIzquierdo);
                postOrden(r.hijoDerecho);
                System.out.print(r.dato+" ");
            }
        }
    }




    public static void main(String[] args) {
        ArbolBinario arbol=new ArbolBinario();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  num;
        for(int i=0; i<n; i++){
            num=sc.nextInt();
            arbol.agregarNodo(num,"1");
        }
        arbol.preOrden(arbol.getRaiz());
        System.out.println();
        arbol.inOrden(arbol.getRaiz());
        System.out.println();
        arbol.postOrden(arbol.getRaiz());


    }
}