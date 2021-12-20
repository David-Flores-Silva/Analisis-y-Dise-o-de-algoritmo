//#Book_Shop.py

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
 
 
int main() {
   fast_io;
   ll t,n,m,x,i,j,k,q;
   //cin >> t;
   t = 1;
   while(t--){
        cin >> n >> x;
        vector<int> price(n+1), pages(n+1);
        fr(1,n+1)
            cin >> price[i];
        fr(1,n+1)
            cin >> pages[i];
 
        int dp[n+1][x+1];
 
        for(int i = 0; i <= n; i++){
            for(int money = 0; money <= x; money++){
                if(money == 0 || i == 0)
                    dp[i][money] = 0;
                else{
                    int op1 = (i == 1) ? 0 : dp[i-1][money];
                    int op2 = (money < price[i]) ? 0 : pages[i] + dp[i-1][money - price[i]];
                    dp[i][money] = max(op1,op2);
                }
            }
        }
        cout << dp[n][x]; 
   }
   return 0;
}

/*
#Input:
#4 10
#4 8 5 3
#5 12 8 1

#Output:
#13

#---------------------------

#n:numero de libros & x:precio maximo
#precio de cada libro: h1, h2, ..., hn
#numero de paginas de cd libro s1, s2, ..., sn

#-----------------------

#Estás en una librería que vende n libros diferentes. Sabes el precio y el número de páginas de
#cada libro.
#Ha decidido que el precio total de sus compras será como máximo x. Cual es el maximo
#número de páginas que puedes comprar? Puedes comprar cada libro como máximo una vez.
*/