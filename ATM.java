import java.util.*;

class ATM
{
    Scanner sc = new Scanner(System.in);
    double balance = 1000000;

    void Check_Balance()
    {
        System.out.println("Account Balance:"+balance);
    }

    void Deposit()
    {
        double amount;

        System.out.println("Enter a Amount you want to Deposit :");
        amount = sc.nextDouble();

        if(amount <= 0)
        {
            throw new IllegalArgumentException("Deposit Amount must be greater than Zero !");
        }
    
        balance = balance + amount ;

        System.out.println("Amount Deposit Successfully:");

        System.out.println("Total Updated Balance :"+balance);
    }

    void Withdraw()
    {
        double amount;

        System.out.println("Enter a Amount You want to Withdraw :");
        amount =sc.nextDouble();

        if(amount <= 0)
        {
            throw new IllegalArgumentException("Withdraw Amount must be greater than Zero !");
        }

        if(amount > balance)
        {

            throw new IllegalArgumentException("Insufficient BAlance of Your Account !");
        }

        balance = balance - amount ;

         System.out.println("Amount Withdraw Successfully:");

        System.out.println("Total Updated Balance :"+balance);

    }
    public static void main(String args[])
    {
        ATM a = new ATM();

        Scanner sc = new Scanner(System.in);

        int choice;

        do
        {
            System.out.println("<----ATM Memu---->");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit Amount");
            System.out.println("3.Withdraw Amount");
            System.out.println("4.Exit");

            System.out.println("Enter your Choice...");
            choice = sc.nextInt();

            try
            {
                switch(choice)
                {
                
                    case 1:
                        a.Check_Balance();
                        break;

                    case 2:
                        a.Deposit();
                        break;

                    case 3:
                        a.Withdraw();
                        break;

                    case 4:
                        break;

                    default:
                        System.out.println("Invalid Choice");

                }

            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e);
            }
            finally
            {
                System.out.println("Transction Process Completed");
            }

        }while(choice != 4);
    }
}