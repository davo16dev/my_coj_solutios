#include <bits/stdc++.h>

using namespace std;

void cantDiv(int n){
    int imp = 1;
    int sol = 1;
    for(int i = 2; i * i <= n; i++){
        int e = 0;
        while(n % i == 0){
            e++;
            n /= i;
        }
        sol *= (e + 1);
        if(i & 1){
            imp *= (e + 1);
        }
    }
    if(n > 1){
        sol *= 2;
        imp *= 2;
    }
    cout << "P: "<< sol - imp << " I: " << imp << "\n";;
    //return sol - imp;
}

int main()
{
    //out << cantDiv(4) << endl;
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        cantDiv(n);
    }


    return 0;
}
