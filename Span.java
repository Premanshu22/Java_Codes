import java.io.*;
import java.util.Scanner;

public class Span {
     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the array : ");
        for(int i=0; i<arr.length; i++ )
        {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length;i++)
        {
            if(arr[i]>max){
                max = arr[i];
            }

            if(arr[i]<min){
                min = arr[i];
            }
        }

        int spann = max - min;
        System.out.println("The result is : " + spann);
     }
}
