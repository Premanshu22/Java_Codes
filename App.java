import java.util.HashSet;
import java.util.Scanner;
class findDuplicate{
        void duplicate(int[] arr){
            HashSet<Integer> hs = new HashSet<>();
            HashSet<Integer> duplicate = new HashSet<>();

            for(int i: arr)
            {
                if(!hs.add(i))
                {
                    duplicate.add(i);
                }
            }

            if(duplicate.isEmpty()){
            System.out.println("No duplicate entry is found.");
            }
            else{
                System.out.println("Duplicate entries are : " + duplicate);
            }
        }
}

public class App {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements in the array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++)
        {
            System.out.print("arr["+i+"]: ");
            arr1[i]=sc.nextInt();
        }

        findDuplicate dup = new findDuplicate();
        dup.duplicate(arr1);
    }
}