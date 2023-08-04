import java.util.*;
//Q1 : Check if an Array is Sorted & Rotated!!
//OP: 3 4 1 2
//Time Complexity: O(N)
//Space Complexity: O(1)
public class S3 {
    static boolean tocheck(int arr[],int n){
        int count = 0;
        for (int i=0;i<=n-1;i++){
            if (arr[i] > arr[(i+1)%n]){
                count++;
            }
        }
        return (count<=1);
    }
    static void toprint(int arr[],int n){
        for (int i=0;i<=n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int arr[] = new int[n];
        //input
        for (int i=0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }
        //output
        System.out.println("RESULTANT ARRAY :");
        toprint(arr,n);
        System.out.println();
        System.out.println("CHECK ARRAY SORTED : "+tocheck(arr,n));
    }
}
