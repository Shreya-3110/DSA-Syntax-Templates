
/*❓ Question:

Given an integer array arr[] of size n, find the majority element.

A majority element is the element that appears more than n/2 times.

If no such element exists, return -1.

✨ Example:

Input: arr = [2, 2, 1, 1, 2, 2, 2]
Output: 2

Input: arr = [1, 2, 3, 4]
Output: -1*/



import java.util.*;
public class MajorityElement{
  public static int majorityElement(int[] arr) {

    int n = arr.length;
    HashMap<Integer, Integer> freq = new HashMap<>();

    for(int num: arr) {
      freq.put(num,freq.getOrDefault(num,0)+1);

    if(freq.get(num) > n/2){
      return num;
    }
      
    }

  return -1;
  }

public static void main(String[] args) {


  int[] arr = {2,2,1,2,3,2,2};
  System.out.println("Majority element is:" + majorityElement(arr));
}
}
