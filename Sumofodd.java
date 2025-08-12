import java.util.Scanner;

public class Sumofodd {
    
    public static int printSum(int n)
    {
        int sum = 0;
        for(int i=1; i<=n; i+=2)
        {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(printSum(n));
    }
}
