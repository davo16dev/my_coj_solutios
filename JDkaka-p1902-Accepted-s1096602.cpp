#include <bits/stdc++.h>

using namespace std;


void rellena(int cant){
    for(int i = 0; i < cant; i++)
        cout << "0";
}


int main()
{
    int t;
    scanf("%d", &t);
    while(t--){

        int gen, day, month, year, city, country, rand;
        scanf("%d %d/%d/%d %d %d %d", &gen, &day, &month, &year, &city, &country, &rand);

        string sol = "";
        int cant = log10(year) + 1;
        cant = 4 - cant;

        cout << gen << "-";
        rellena(cant);
        cout << year << "-";

        cant = log10(month) + 1;
        cant = 2 - cant;
        rellena(cant);
        cout << month << "-";

        cant = log10(day) + 1;
        cant = 2 - cant;
        rellena(cant);
        cout << day << "-";

        cant = log10(city) + 1;
        cant = 4 - cant;
        rellena(cant);
        cout << city << "-";

        cant = log10(country) + 1;
        cant = 3 - cant;
        rellena(cant);
        cout << country << "-";

        cant = log10(rand) + 1;
        cant = 4 - cant;
        rellena(cant);
        cout << rand << "\n";
    }

    return 0;
}
