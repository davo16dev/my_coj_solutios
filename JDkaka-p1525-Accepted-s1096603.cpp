#include <cstdio>

using namespace std;

int sum, pot = 1;

int cant_vacas(int n,int m)
{
    while(n & 1 && m & 1 && n != 0 && m != 0)
    {
         sum += pot;
         pot *= 4;
         n /= 2;
         m /= 2;
    }
    return sum;
}

int main()
{
    int n,m;
    
    scanf("%d%d",&n,&m);
    
    int answer = cant_vacas(n,m);
    
    printf("%d\n",answer);
    
    return 0;

}