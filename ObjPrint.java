class A{
    int i = 10;
    public String toString()
    {
        return "Its an instance of class A";
    }
}

public class ObjPrint {
    public static void main(String[]args){
        A a1 = new A();
        System.out.println(a1.i);
        System.out.println(a1);
    }
}
