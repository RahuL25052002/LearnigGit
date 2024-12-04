#include<stdio.h>

void fun2(int j,int N){
	if(j>N){
		return;
	}
	fun2(++j,N);
	printf("%d\n",j);
}

int main(){
	fun2(1,8);
	return 0;
}


