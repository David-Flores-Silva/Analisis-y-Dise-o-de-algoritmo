//#Rectangle_Cutting.py


#include<bits/stdc++.h>
#define ll long long
#define pb push_back
#define fr(a,b) for(int i = a; i < b; i++)
#define rep(i,a,b) for(int i = a; i < b; i++)
#define mod 1000000007
#define inf (1LL<<60)
#define all(x) (x).begin(), (x).end()
#define prDouble(x) cout << fixed << setprecision(10) << x
#define triplet pair<ll,pair<ll,ll>>
#define fast_io ios_base::sync_with_stdio(false);cin.tie(NULL)
using namespace std;
 
int solve(int a, int b){
    //Respecto a la solucion del problema, en este metodo vamos a 
    //se ira analizando si la altura o la base es mayor que uno
    //ya que es el principal requisitop que nos indica el problema
    // (que sea numero entero)
    int dp[a+1][b+1];
 
    for(int height = 1; height <= a; height++){
        for(int width = 1; width <= b; width++){
            if(height == width)
                dp[height][width] = 0;
            else{
                int ans = 1e8;
                for(int i = 1; i < width; i++)
                    ans = min(ans, 1 + dp[height][width - i] + dp[height][i]);
                for(int i = 1; i < height; i++)
                    ans = min(ans, 1 + dp[height - i][width] + dp[i][width]);
                dp[height][width] = ans;
            }
        }
    }
    return dp[a][b];
}
 
int main() {
    //por este metodo principal se hara el llamado a la funcion solve
   fast_io;
   ll t,n,m,x,i,j,k,q;
   //cin >> t;
   t = 1;
   while(t--){
        int a,b;
        cin >> a >> b;
        cout << solve (a,b);
   }
   return 0;
}

/*
#Pruebas-cses.fi
#Input: 3 5
#Output: 3

#Dado un rectángulo a × b, su tarea es cortarlo en cuadrados. En cada movimiento puede 
#seleccionar un rectángulo y córtelo en dos rectángulos de tal manera que todas las 
#longitudes de los lados sigan siendo números enteros. Qué
#Cuál es el número mínimo posible de movimientos?
*/