import java.io.FileNotFoundException;

public class inheriex {
    public void meth1() throws RuntimeException
    {
        int a = 10;
        int b = 0;
        int result = a/b;

        System.out.println("Result : "+result);
    }

}

class Demo{
    public static void main(String[]args)
    {
        try{
            inheriex i1 = new inheriex();
            i1.meth1();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}


class Subx extends inheriex{
    public void meth1() throws ArithmeticException {

    }
}