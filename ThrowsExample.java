// WAP to search the item in array.

//Find the maximum & minimum number in an array of integers. 
//import java.util.Scanner;

/*class Array {

    public static void main(String[] args) {
        System.out.println("Hey, Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (number[i] < min) {
                min = number[i];
            }
            System.out.println("the max numbers are: " + max);
            System.out.println("the min numbers are: " + min);
        }
    }
}*/
// WAP to show if the array is sorted or not...
/*class Array {

    public static void main(String[] args) {
        System.out.println("Hey, Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("the array is sorted..");
        } else {
            System.out.println("the array is not sorted...");
        }
    }
}*/
// WAP to show even or odd numbers...
/*class Array {

    public static void main(String[] args) {
        System.out.println("Hey, Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.println("the number is a even number: " + number[i]);
            } else {
                System.out.println("the number is odd..."+ number[i]);
            }
        }
    }
}*/
// WAP to show the prime numbers in array
/*import java.util.Scanner;

class Array {

    /*  public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println(" The array elements are : ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        for (int i = 0; i < number.length; i++) {
            if (isPrime(number[i])) {
                System.out.println(number[i] + "is a prime number...");
            } else {
                System.out.println(number[i] + "is not a prime number...");
            }
        }
        sc.close();
    }
}*/
// WAP to show the all elements in two d array.
/*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();
        int[][] numbers = new int[rows][col];
        System.out.println("enter the number of elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("number to be searched: ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == x) {
                    System.out.print("item found at:" + i + ", " + j);
                }
            }
            System.out.println();
        }
    }
}
 */
// WAP to calculate the sum of all prime numbers in an array.
/*import java.util.*;
class Array {

      public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println(" The array elements are : ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        int sum =0;
        for (int i = 0; i < number.length; i++) {
            if (isPrime(number[i])) {
                sum = sum +number[i];
            } 
            }
                System.out.println(sum);
        }
    }
 */
//WAP to do bubble sort operation on an array.
/*import java.util.*;
class Array{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int [size];
        for (int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<arr.length-1;i++){
            for (int j = 0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
            System.out.println("Sorted array:");
            for(int num : arr){
                System.out.println(num + " ");
            }
        }
}
// WAP to do selection sort in an given array.
/*import java.util.*;
class Selection{
    public static void main (String [] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array: ");
     int size = sc.nextInt();
     int arr[] = new int [size];
     System.out.println("Enter the element of array: ");
     for (int i =0 ; i<size;i++){
         arr[i] = sc.nextInt();
     }
     for (int i =0; i<arr.length-1;i++){
         int smallest = i;
         for (int j = i+1; j<arr.length;j++){
             if(arr[smallest]>arr[j]){
                 smallest = j;
             }
         }
         int temp = arr[smallest];
         arr[smallest] = arr[i];
         arr[i] = temp;
     }
     System.out.println("Selection sorted array is : ");
     for (int num : arr){
         System.out.print(num + " ");
     }
     System.out.println();
    }
}*/
class ThrowsExample {
    public static void main(String[] args) {
        System.out.print("hello world");
    }
}