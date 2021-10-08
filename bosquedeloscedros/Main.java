import java.util.*;

public class Main {
    public static class NodoArbol {
        int dato;
        NodoArbol hijoIzquierdo;
        NodoArbol hijoDerecho;
        public NodoArbol(int dato){
            this.dato=dato;
            this.hijoDerecho=null;
            this.hijoIzquierdo=null;
        }
    }
    public static class ArbolBinario{
        NodoArbol raiz;
        public ArbolBinario(){
            this.raiz=null;
        }
        public void agregarNodo(int dato){
            NodoArbol nuevo=new NodoArbol(dato);
            if(raiz==null){
                this.raiz=nuevo;
            }else{
                NodoArbol temp=this.raiz;
                NodoArbol padre;
                while(true){
                    padre=temp;
                    if(dato<temp.dato){
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
        public void preOrden(NodoArbol r, ArrayList<Integer> lista){
            if(r!=null){
                if(r.hijoDerecho==null && r.hijoIzquierdo==null){
                    lista.add(r.dato);
                }
                preOrden(r.hijoIzquierdo,lista);
                preOrden(r.hijoDerecho, lista);
            }
        }
        private int nodosHojasR(NodoArbol tmp){
            int cuenta = 0;
            if(tmp.hijoIzquierdo == null && tmp.hijoDerecho == null)
                cuenta = 1;
            else{
                if (tmp.hijoIzquierdo != null)
                    cuenta += nodosHojasR(tmp.hijoIzquierdo);
                if (tmp.hijoDerecho != null)
                    cuenta += nodosHojasR(tmp.hijoDerecho);
            }
            return cuenta;
        }

        }


    public static void main(String[] args) {
        ArbolBinario arbol=new ArbolBinario();
        Scanner sc=new Scanner(System.in);
        int  num;
        int n;
        n=sc.nextInt();
        for(int i=0; i<n; i++){
            num=sc.nextInt();
            arbol.agregarNodo(num);
        }
        int nHojas=arbol.nodosHojasR(arbol.raiz);
        System.out.println(nHojas);
        ArrayList<Integer> hojas=new ArrayList<>();
        arbol.preOrden(arbol.raiz, hojas);
        Collections.sort(hojas);
        for(Integer i: hojas){
            System.out.print(i+" ");
        }
    }
}