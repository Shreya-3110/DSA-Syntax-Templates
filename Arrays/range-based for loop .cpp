#include<iostream>
using namespace std;

int main() {
  int arr[] = {10,20,30,40};

  cout<< "Traversing using range-based for loop:" << endl;
  for(int x: arr) {
    cout<< x << "";
    
  }

  return 0;
}
