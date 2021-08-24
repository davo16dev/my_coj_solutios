#include <bits/stdc++.h>

using namespace std;

int main(){
	string s1,s2;
	while(cin>>s1>>s2){
		string s3="";
		int j=0,k=0;
		for(int i=0; i<s1.size(); i++){
			for(j=k; j<s2.size(); j++){
				if(s2[j]==s1[i]){
					s3+=s2[j];
					k=j+1;
					break;
				}
			}
		}
		if(s1==s3)cout<<"Yes"<<endl;
		else cout<<"No"<<endl;
	}
	return 0;
}