#include <bits/stdc++.h>

using namespace std;

typedef pair <int, int> par;
typedef pair <int, par> trio;

const int dx[] = {-1, -1, -1, 0, 1, 1, 1, 0};
const int dy[] = {-1, 0, 1, 1, 1, 0, -1, -1};

const int MAXN = 1005;

int N, K, CN;
vector <par> G;

int costo[MAXN][MAXN];
bool mk[MAXN][MAXN];

int Dist[12][12];

int dp[(1 << 12)][12];
bool calc[(1 << 12)][12];

void bfs(par ini)
{
    queue <par> cola;

    for(int i = 1; i <= N; i++)
        for(int j = 1; j <= N; j++)
            costo[i][j] = mk[i][j] = 0;

    cola.push(ini);
    mk[ini.first][ini.second] = true;
    while(!cola.empty())
    {
        par actual = cola.front();
        cola.pop();

        for(int i = 0; i < 8; i++)
        {
            par coo = par(actual.first + dx[i], actual.second + dy[i]);
            if(coo.first <= N && coo.second <= N && coo.first >= 1 && coo.second >= 1 && !mk[coo.first][coo.second])
            {
                cola.push(coo);
                mk[coo.first][coo.second] = true;
                costo[coo.first][coo.second] = costo[actual.first][actual.second] + 1;
            }
        }
    }
}

int solve(int S, int j)
{
    if(S == 1)
        return 0;

    if(!calc[S][j])
    {
        int sol = (1 << 30);
        int ss = S - (1 << j);
        for(int x = 0; x < CN; x++)
            if((1 << x) & ss)
                sol = min(sol, solve(ss, x) + Dist[x][j]);
        dp[S][j] = sol;
        calc[S][j] = true;
    }
    return dp[S][j];
}

int main()
{
    cin >> N >> K;
    G.push_back(par(1, 1));
    for(int i = 1; i <= K; i++)
    {
        int x, y;
        cin >> x >> y;
        G.push_back(par(x, y));
    }
    G.push_back(par(N, N));
    CN = K + 2;

    for(int i = 0; i < CN; i++)
    {
        bfs(G[i]);
        for(int j = 0; j < CN; j++)
            if(i != j)
                Dist[i][j] = Dist[j][i] = costo[G[j].first][G[j].second];
    }

    cout << solve((1 << CN) - 1, CN - 1) << endl;

    return 0;
}
