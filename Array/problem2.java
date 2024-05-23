// Find the total number of pairs in the array whose sum is equal to the given value x.
// Input: arr[]={4,6,3,5,8,2};
// Element:7
// Output:2

import java.util.Scanner;

class problem2{

    static int numberOfPairs(int arr[] , int element){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int temp = arr[i];
            for(int j=i+1;j<n;j++){
               if(arr[j]+temp==element){
                count++;
               }
            }
        }
        return count;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array-"); 
        int numberOfElements = sc.nextInt();
        int array[] = new int[numberOfElements];
        System.out.println("Enter elements of array-");
        for(int i=0;i<numberOfElements;i++){
           array[i] = sc.nextInt();
        }
        System.out.println("Enter element");
        int element = sc.nextInt();

        int result = numberOfPairs(array , element);
        System.out.println("Total number of pairs in the array whose sum is equal to the given value x is " + result);

        sc.close();
    }
}

