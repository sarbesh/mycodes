#include<stdio.h>
#include<string.h>

int main(int argc, char *argv[]){
		if(argc == 2){
				printf("Checking licence %s\n",argv[1]);
				if(strcmp(argv[1],"AAA-Z10N-SN3-OK")==0){
						printf("Access Granted\n");
				} else {
						printf("Invalid Key\n");
				}
		} else {
				printf("Usage: licence <KEY>\n");
		}
}
