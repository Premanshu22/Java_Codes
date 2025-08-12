import java.util.Scanner;

class FirstNonRep{
    public char findFirstNonRep(String str){
        if(str == null || str.isEmpty())
        {
            return '$';
        }

        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            boolean isRepeating = false;

            for(int j=0; j<str.length(); j++)
            {
                if( i != j && c == str.charAt(j))
                {
                    isRepeating = true;
                    break;
                }
            }
            
            if(!isRepeating)
            {
                return c; //found first character
            }
        }

        return '$';
    }
}


public class Nonr {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = sc.nextLine();

        FirstNonRep find = new FirstNonRep();

        char result = find.findFirstNonRep(input);

        System.out.println("Original String : "+input);
        System.out.println("First non repeating character : "+result);
        
        sc.close();
    }
}
