import java.util.Scanner;

public class BasicArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Declare an array of size 5
    int[] arr = new int[5];

    //input elements
    for(int i = 0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }

// output elements
    for(int i =0; i < arr.length; i++ ){
     System.out.print(arr[i] + "");
    }

//size of array
    System.out.println("\nSize:" + arr.length);
    sc.close();
      
  }
}
