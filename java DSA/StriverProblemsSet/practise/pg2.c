#include<stdio.h>

int  main(){
	
	int count=0;
	printf("Enter  the n Number  you want to enter: ");
	int n;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		count=count+5;
	}
	printf("%d\n",count);
}
