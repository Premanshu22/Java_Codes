import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++)
        {
            System.out.print("arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements : ");

        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++)
        {
            if(visited[i])
            {
                continue;
            }

            int count=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    visited[j] = true;
                    count ++;
                }
            }
            
            if(count > 1){
                System.out.println(arr[i] + "-" +count+"times");
            }
        }
        sc.close();
    }
}
