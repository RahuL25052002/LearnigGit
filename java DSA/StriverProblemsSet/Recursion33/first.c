#include<stdio.h>

int count=0;
void fun(){
	if(count==4){
		return;
	}
	printf("%d \n",count);
	count++;
	fun();

}




int main(){
	
	fun();
	return 0;
}
