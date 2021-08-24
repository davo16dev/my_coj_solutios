#include <cstdio>
#include <iostream>
#include <algorithm>

using namespace std;

struct conc{
    int id, pr, t, k;
}A[1500];

bool comp1(const conc &a, const conc &b)
{
    if(a.pr != b.pr)
        return a.pr > b.pr;
    return a.t < b.t;
}

bool comp2(const conc &a, const conc &b)
{
    return a.id < b.id;
}


int main()
{
    //freopen("d.in", "r", stdin);

    int N, K;
    cin >> N >> K;

    for(int i = 1; i <= N; i++)
        cin >> A[i].id >> A[i].pr >> A[i].t;

    sort(A + 1, A + N + 1, comp1);

    //for(int i = 1; i <= N; i++)
    //    cout << A[i].id << ' ' << A[i].pr << ' ' << A[i].t << ' ' << A[i].k << endl;;

    int p = 1;
    for(int i = 1; i <= N; i++)
    {
        A[i].k = p;
        if(i % K == 0)
            p++;
    }
    //cout << endl << endl;

    sort(A + 1, A + N + 1, comp2);
    for(int i = 1; i <= N; i++)
        cout << A[i].k << endl;

    return 0;
}