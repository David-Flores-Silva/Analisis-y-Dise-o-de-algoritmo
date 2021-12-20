//https://cses.fi/problemset/task/1672
//title  

#include<bits/stdc++.h>
using namespace std;

const int N = 501;
typedef long long ll;
ll n,m,q;

int main(){
    //esta sera nuestra funcion principal, con nuestra variable ll
    //se creara un arreglo doble ll[][] de tamaño 501
    ll v[N][N];
    memset(v,0x3f,sizeof(v));

    cin>>n>>m>>q;

    //mediante este buble while llando a la funcion min tendremos q 
    //hallar el costo minimo que hay desde la ciudad A hasta B
    while(m--){
        ll a,b,c;
        cin>>a>>b>>c;
        a--;b--;
        v[a][b] = min(v[a][b],c);
        v[b][a] = min(v[a][b],c);
    }

    for(int i=0;i<n;i++){
        v[i][i]=0;
    }

    //acá analizamos las relaciones que puede tener una ciudad con otra
    for(int k=0;k<n;k++){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                v[i][j] = min(v[i][j],v[i][k]+v[k][j]);
                // cout<<v[i][j]<<" ";
            }
        }
    }

    while(q--){
        int a,b;
        cin>>a>>b , a--, b--;
        cout<<(v[a][b]>=1e18?-1:v[a][b])<<endl;
    }
    return 0;
}


/*
''' Input:
4 3 5
1 2 5
1 3 9
2 3 3
1 2
2 1
1 3
1 4
3 2

Output:
5
5
8
-1
3 '''

#-----------------------

#Hay n ciudades y m carreteras entre ellas. Tu tarea es procesar consultas
# q en las que tienes que determinar la longitud de la ruta más corta entre 
# dos ciudades determinadas.
*/