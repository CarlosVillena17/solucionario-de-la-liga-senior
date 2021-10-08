#include<bits/stdc++.h>

using namespace std;

int main(){
int n;
int minutos;
int numTelefonos;
cin>>n;
queue<int> colaMinutos;
queue<int> colaNumeros;
queue<int> colaTelefonosAtendidos;
stack<int> pilaEspera;
int arregloMinutos[n];
for(int i=0; i<n; i++){
    cin>>minutos;
    colaMinutos.push(minutos);
}

for(int i=0; i<n; i++){
    cin>>numTelefonos;
    colaNumeros.push(numTelefonos);
}
int min;
int i=0;
while(!colaMinutos.empty()){
    min=colaMinutos.front();
    if(!colaNumeros.empty()){
        colaTelefonosAtendidos.push(colaNumeros.front()); //3000
        colaNumeros.pop();
    }
    if(min>1){
        while(min!=1){
            min--;
            if(!colaNumeros.empty()){
                pilaEspera.push(colaNumeros.front());
                colaNumeros.pop();
            }
        }
    }
    colaMinutos.pop();

}
while(!pilaEspera.empty()){
    colaTelefonosAtendidos.push(pilaEspera.top());
    pilaEspera.pop();
}

while(!colaTelefonosAtendidos.empty()){
    cout<<colaTelefonosAtendidos.front()<<endl;
    colaTelefonosAtendidos.pop();
}


return 0;
}