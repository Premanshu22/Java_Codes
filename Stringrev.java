import java.util.Scanner;
public class Stringrev {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        String reversed = "";

        if(input == null && input == "")
        {
            reversed = input;
        }
        
        else{
        for(int i=input.length() -1 ; i>=0; i--)
        {
            reversed += input.charAt(i);
        }
    }
        System.out.println("Original String : "+ input);
        System.out.println("Reversed String : "+ reversed);

        sc.close();
    }
}
