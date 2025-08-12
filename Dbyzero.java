public class Dbyzero {
    public static void main(String[]args)
    {
        int a = 10;
        int b = 0;
        try{
        int result = a/b;
        System.out.println("Result : "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("You cannot divide by zero "+e);
        }
    }
}
