#include <stdio.h>
#include <unistd.h>

int main() {
	if (getuid()) {
		printf("Please run this program as root\n");
		return 1;
	}

	printf("I am elevated\n");
	return 0;
}