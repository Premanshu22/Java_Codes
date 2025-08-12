//code for benjamin bulb
//You are given n number of bulbs. They all are switched off.
//A weird fluctuation hits the circuit n times.
// --- In the 1st fluctuation all bulbs are toggled.
// --- In the 2nd fluctuation every 2nd bulbs are toggled.
// --- In the 3rd fluctuation every 3rd blubs are toggled.


import java.util.Scanner;
import static java.lang.Math.*;
public class Bulb {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bulbs: ");
        int n = sc.nextInt();

        System.out.print("Bulb number that is on : ");
        for(int i=1; i*i<=n; i++)
        {
            System.out.print(i * i+" ");
        }

        Bulb b1 = new Bulb();
        int nOB = b1.noOfBulbsOn(n);
        System.out.println("\n The number of bulbs on : "+ nOB);

    }
    
    int noOfBulbsOn(int n){
        return (int) sqrt(n);
    }
}
