import java.util.*;

class Calculator
{
    int a  , b , c;

    Scanner sc = new Scanner(System.in);
    void Accept()
    {
        System.out.println("Enter a First NUmber:");
        a = sc.nextInt();

        System.out.println("Enter a Second Number:");
        b = sc.nextInt();
    }
    void Addition()
    {
            c = a + b;

            System.out.println("Addition of Two NUmbers:"+c);
    }
    void Substraction()
    {
            c = a - b;

            System.out.println("Substraction of Two NUmbers:"+c);
    }
    void Multiplication()
    {
            c = a * b;

            System.out.println("Multiplication of Two NUmbers:"+c);
    }
    void Division()
    {
        try
        {
             c = a / b;

            System.out.println("Division of Two NUmbers:"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by Zero"+e);
        }
           
    }
    public static void main(String args[])
    {
        Calculator c = new Calculator();

        c.Accept();
        c.Addition();
        c.Substraction();
        c.Multiplication();
        c.Division();
    }
}