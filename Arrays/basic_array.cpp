#include <iostream>
using namespace std;

int main() {
  //declare an array of size 5
  int arr[5] = {1,2,3,4,5}
  
}


for(int i = 0; i<5; i++) {
  cin >> arr[i];
}

//Output elements
for(int i =0; i < 5; i++) {
  cout << arr[i] <<"";
}


//size of array 
int n = sizeof(arr) / sizeof(arr[0]);
cout<< "\nSize:" << n;

return 0;
}
 
