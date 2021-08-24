#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    scanf("%d", &t);

    while(t--){
        double a, b, d;
        scanf("%lf %lf %lf", &a, &b, &d);

        double sol = d / (a + b);
        printf("%.4lf\n", sol);
    }




    return 0;
}
