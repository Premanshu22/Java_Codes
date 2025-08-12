import java.util.Scanner;

class Stringrev {
    public String reverse(String input)
    {
        if(input == null && input == "")
        {
            return input;
        }
        else{
            String reversed = "";

            for(int i=input.length() -1 ; i>=0; i--)
            {
                reversed += input.charAt(i);
            }

            return reversed;
        }
    }
}

public class MainApp{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        Stringrev reverse = new Stringrev();

        String reversedString = reverse.reverse(input);

        System.out.println("Original String : "+ input);
        System.out.println("Reversed String : "+ reversedString);

        sc.close();
    }
}
