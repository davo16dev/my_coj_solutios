#include <stdio.h>
int a,b,i;main(){while((i=getc(stdin))>32)a=a*10+i-48;while((i=getc(stdin))>32)b=b*10+i-48;printf("%d",a+b);}