#include<iostream>
using namespace std;

int main(){


        int n;
        cin>>n;
        int origen, destino;
        int matrizadyacencia[10][10];
        for(int i=0; i<n; i++){
            cin>>origen;
            cin>>destino;
            matrizadyacencia[origen][destino]=1;
            matrizadyacencia[destino][origen]=1;
        }
        int consulta;
        cin>>consulta;
        for(int i=0; i<10; i++){
            if(matrizadyacencia[consulta][i]==1){
                cout<<i<<" ";
            }
        }
return 0;
}