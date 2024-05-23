package Array;
// Calculate the maximum value out of all the elements in the array.
// Input : arr[] = {1, 5, 3}
// Output : 5

import java.util.Scanner;

class problem1{

    static int maximunValue(int array[]){
        int n = array.length;
        int max_element = 0;
        for(int i=0;i<n;i++){
            if(array[i]>max_element){
                max_element = array[i];
            }
        }
        return max_element;
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

        int result =  maximunValue(array);
        System.out.println("Maximum value out of all elements in the array is " + result);

        sc.close();
    }
}