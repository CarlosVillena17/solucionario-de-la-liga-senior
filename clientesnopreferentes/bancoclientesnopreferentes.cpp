#include<bits/stdc++.h>
using namespace std;

int main(){
int n;
char c;
int fila;
int fila2;
string nombre;
cin>>n;
queue<string> cola;
stack<string>  pila;
vector<string> v;
while(n--){
    cin>>c;
    if(c=='E'){
        cin>>fila;
        cin.ignore();
        cin>>nombre;
        if(fila==1){
            cola.push(nombre);
        }else if(fila==2){
            pila.push(nombre);
        }
    }else if(c=='A'){
        cin>>fila2;
        if(fila2==1){
            v.push_back(cola.front());
            cola.pop();
        }else if(fila2==2){
            v.push_back(pila.top());
            pila.pop();
        }

    }
}

for(auto it=v.begin(); it!=v.end(); it++){
    cout<<*it<<"\n";
}

return 0;
}