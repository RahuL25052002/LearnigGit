// sum of elements 
//
#include<stdio.h>


int sumOfNumber(int n, int count){
	if(n>count){
		return n;
	}
	return sumOfNumber(n+1,count)+sumOfNumber(n+2,count);
}

int main(){
	int n,count;
	n=1;
	count=10;
	int ans=sumOfNumber(1,10);

	printf("%d\n",ans);

}
