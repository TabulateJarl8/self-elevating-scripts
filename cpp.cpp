#include <iostream>
#include <unistd.h>

using namespace std;

int main() {

	if (getuid()) {
		cout << "Please run this program as root" << endl;
		return 1;
	}

	cout << "I am elevated" << endl;

	return 0;
}